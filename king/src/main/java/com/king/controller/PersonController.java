package com.king.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.entity.Person;
import com.king.service.IPersonService;
import com.king.utils.ResultInfo;
import com.king.utils.ResultTool;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月6日 上午9:32:03 
* Describe:
*/
@RestController
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@PostMapping("selectAllPerson")
	public ResultInfo selectAllPerson(int page, int rows) {
		return personService.selectAllPerson(page, rows);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("insertPerson")
	public Map insertPerson(Person person) {
		try {
			personService.insertPerson(person);
			return ResultTool.ajaxResult(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}
	
	@GetMapping("getPerson")
	public Person getPerson(String id) {
		return personService.getPerson(id);
	}
	
	
	@SuppressWarnings("rawtypes")
	@PostMapping("updatePerson")
	public Map updatePerson(Person person) {
		try {
			personService.updatePerson(person);
			return ResultTool.ajaxResult(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("deletePerson")
	public Map deletePerson(String id) {
		try {
			personService.deletePerson(id);
			return ResultTool.ajaxResult(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultTool.ajaxResult(false, "服务器发生错误，请稍后再试");
	}

}
