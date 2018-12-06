package com.king.utils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.king.entity.User;
import com.king.service.UserService;

/**
 * @author M_youj E-mail: 18565544225@163.com
 * @version 创建时间：2018年12月6日 下午3:17:19 Describe:
 */
public class UserRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		return null;

	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 1.得到令牌
		UsernamePasswordToken tokens = (UsernamePasswordToken) token;
		// 2.调用业务组件进行登录判断
		String password = new String(tokens.getPassword());
		User user = userService.getUser(tokens.getUsername(), password);
		System.out.println(user);
		// 3.判断用户是否为空，如果不为空代表登录成功
		if (user != null) {
			return new SimpleAuthenticationInfo(user, // priciple，使用当前登录用户对象
					password, // credentials
					user.getName()); // realmName
		}
		// 方法返回Null代表验证失败
		return null;
	}

}
