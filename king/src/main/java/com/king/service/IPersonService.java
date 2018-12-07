package com.king.service; 
/** 
* @author M_youj E-mail: 18565544225@163.com
* @version 创建时间：2018年12月6日 上午9:31:26 
* Describe:
*/

import java.util.List;

import com.king.entity.Person;
import com.king.utils.ResultInfo;

public interface IPersonService {
	
	ResultInfo selectAllPerson(int page, int rows);
	
	List<Person> getAllPerson();
	
	void insertPerson(Person person);
	
	Person getPerson(String id);
	
	void updatePerson(Person person);
	
	void deletePerson(String id);
	
	void insertPerson(List<Person> persons);

}
