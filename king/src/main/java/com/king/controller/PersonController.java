package com.king.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
	
	@GetMapping("exportStudent")
	public void exportStudent(HttpServletResponse response) throws Exception {
		// 设置响应头
		response.setHeader("Content-Disposition", "attachement;filename=" + URLEncoder.encode("学生统计表.xls", "UTF-8"));
		// 创建工作簿
		HSSFWorkbook wb = new HSSFWorkbook();
		// 创建工作表
		HSSFSheet sheet = wb.createSheet("学生统计表");
		// 创建标题行
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("编号");
		row.createCell(1).setCellValue("学生姓名");
		row.createCell(2).setCellValue("学号");
		row.createCell(3).setCellValue("RFID");
		row.createCell(4).setCellValue("状态");

		List<Person> persons = personService.getAllPerson();
		for (int i = 1; i <= persons.size(); i++) {
			Person person = persons.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(person.getId());
			row.createCell(1).setCellValue(person.getName());
			row.createCell(2).setCellValue(person.getNumber());
			row.createCell(3).setCellValue(person.getRfid());
			row.createCell(4).setCellValue(person.getStatus() ? "已签到" : "未签到");
		}
		
		// 把工作簿输出
		wb.write(response.getOutputStream());
		// 关闭资源
		wb.close();
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("importStudent")
	public Map importStudent(HttpServletRequest request, MultipartFile file) {
		HSSFWorkbook wb = null;

		try {
			String contentType = file.getContentType();

			if (!"application/vnd.ms-excel".equals(contentType)) {
				return ResultTool.ajaxResult(true, "上传文件不是Excel类型");
			}

			// 第一步：把Excel文件解析成HSSFWorkbook对象；
			wb = new HSSFWorkbook(file.getInputStream());
			// 第二步：通过该对象获取分页Sheet对象；
			HSSFSheet sheet = wb.getSheetAt(0);
			// 第三步：获取总的行数；
			int lastRowNum = sheet.getLastRowNum();
			//该集合用于读取到的设备
			List<Person> persons = new ArrayList<Person>();
			for(int i = 1; i <= lastRowNum; i++) {
				HSSFRow row = sheet.getRow(i); //获取行
				String id = row.getCell(0).getStringCellValue(); //获取单元格数据，下标从0开始
				String name = row.getCell(1).getStringCellValue();
				String number = row.getCell(2).getStringCellValue();
				String rfid = row.getCell(3).getStringCellValue();
				boolean status = false;
				if("已签到".equals(row.getCell(4).getStringCellValue().toString())) {
					status = true;
				}
				persons.add(new Person(id, name, number, rfid, status));
			}
			personService.insertPerson(persons);
			return ResultTool.ajaxResult(true, "导入成功");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(wb != null) {
				try {
					wb.close();
				} catch (IOException e) {
					
				}
			}
		}
		return ResultTool.ajaxResult(true, "导入失败");
	}

}
