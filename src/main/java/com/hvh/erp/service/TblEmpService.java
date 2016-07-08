package com.hvh.erp.service;

import com.hvh.erp.pojo.TblEmp;
import com.hvh.erp.pojo.TblEmpRole;
import com.hvh.erp.pojo.vo.TblEmpRoleVO;

public interface TblEmpService extends BaseService<TblEmp> {
	public TblEmp findUserLogin(TblEmp tblEmp) throws Exception;

	public void insertEmpInfo(TblEmpRoleVO tblEmpRoleVO);
	
	public void insertEmpRole(TblEmpRole tblEmpRole);

}
