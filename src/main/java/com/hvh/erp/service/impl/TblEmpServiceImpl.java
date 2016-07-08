package com.hvh.erp.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.hvh.erp.dao.TblEmpMapper;
import com.hvh.erp.dao.TblEmpRoleMapper;
import com.hvh.erp.pojo.TblEmp;
import com.hvh.erp.pojo.TblEmpRole;
import com.hvh.erp.pojo.vo.TblEmpRoleVO;
import com.hvh.erp.service.TblEmpService;
import com.hvh.erp.util.MD5Util;

@Service
public class TblEmpServiceImpl extends BaseServiceImpl<TblEmp> implements
		TblEmpService {

	@Autowired
	private TblEmpMapper tblEmpMapper;
	@Autowired
	private TblEmpRoleMapper tblEmpRoleMapper;

	public TblEmp findUserLogin(TblEmp tblEmp) throws Exception {
		Example example = new Example(TblEmp.class);
		example.createCriteria().andEqualTo("username", tblEmp.getUsername());
		example.createCriteria().andEqualTo("pwd", tblEmp.getPwd());
		return tblEmpMapper.selectByExample(example).get(0);
	}

	public void insertEmpInfo(TblEmpRoleVO tblEmpRoleVO) {
		TblEmp tblEmp =tblEmpRoleVO.getTblEmp();
		tblEmp.setPwd(MD5Util.MD5(tblEmpRoleVO.getTblEmp().getPwd()));
		tblEmp.setBirthday(new Date().getTime());
		tblEmp.setLastlogintime(new Date().getTime());
		tblEmp.setLastloginip("127.0.0.1");
		tblEmp.setLogintimes(0);
		tblEmpMapper.insert(tblEmp);
		//插入选中角色信息
		TblEmpRole tblEmpRole=new TblEmpRole();
		for (int i = 0; i < tblEmpRoleVO.getRoleUuids().length; i++) {
			tblEmpRole.setRoleuuid(tblEmpRoleVO.getRoleUuids()[i]);
			tblEmpRole.setEmpuuid(tblEmp.getUuid());
			tblEmpRoleMapper.insert(tblEmpRole);
		}
		
	}

	@Override
	public void insertEmpRole(TblEmpRole tblEmpRole) {
		tblEmpRoleMapper.insert(tblEmpRole);
	}

}
