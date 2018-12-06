package com.king.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.king.entity.Person;
import com.king.mapper.PersonMapper;
import com.king.service.IPersonService;
import com.king.utils.DataTool;
import com.king.utils.ResultInfo;
import com.king.utils.ResultTool;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月6日 上午9:31:51 
* Describe:
*/
@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public ResultInfo selectAllPerson(int page, int rows) {
		PageHelper.startPage(page, rows);
		List<Person> persons = personMapper.selectAllPerson();
		PageInfo<Person> pageInfo = new PageInfo<>(persons);
		return ResultTool.setResult(pageInfo, persons);
	}

	@Override
	public void insertPerson(Person person) {
		person.setId(DataTool.getUuid());
		personMapper.insertPerson(person);
		
	}

	@Override
	public Person getPerson(String id) {
		
		return personMapper.getPerson(id);
	}

	@Override
	public void updatePerson(Person person) {
		personMapper.updatePerson(person);
		
	}

	@Override
	public void deletePerson(String id) {
		personMapper.deletePerson(id);
		
	}
	
	

}
