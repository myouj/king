package com.king.mapper;

import java.util.List;

import com.king.entity.Person;

/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月6日 上午9:30:31 
* Describe:
*/
public interface PersonMapper {
	
	List<Person> selectAllPerson();

	void insertPerson(Person person);
	
	Person getPerson(String id);
	
	void updatePerson(Person person);
	
	void deletePerson(String id);
}
