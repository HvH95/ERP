package com.hvh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hvh.erp.pojo.TblDep;
import com.hvh.erp.pojo.TblEmp;
import com.hvh.erp.service.TblDepService;
import com.hvh.erp.service.TblEmpService;

@RunWith(SpringJUnit4ClassRunner.class)
// 配置加载文件
@ContextConfiguration(locations = {
		"classpath*:/spring/applicationContext.xml",
		"classpath*:/spring/springmvc.xml" })
public class testdao {

	@Autowired
	private TblDepService tblDepService;
	@Autowired
	private TblEmpService tblEmpService;

	// @Test
	// public void test() throws Exception {
	// TblDep model=tblDepMapper.selectByPrimaryKey(1L);
	// System.out.println(model.getName());
	// }
	//
	@Test
	public void testfindUserLogin() throws Exception {
		TblEmp e = new TblEmp();
		e.setUsername("root");
		e.setPwd("root");
		TblEmp model = tblEmpService.findUserLogin(e);
		System.out.println(model.getName());
	}

	@Test
	public void testselectDepList() throws Exception {
		List<TblDep> list = tblDepService.queryAll();
		for (TblDep model : list) {
			System.out.println(model.getName());
		}
	}
	
	@Test
	public void testselectDep() throws Exception {
		TblDep t=new TblDep();
		t.setName("ccc");
		
		TblDep model = tblDepService.queryOne(t);
		System.out.println(model);
	}

}
