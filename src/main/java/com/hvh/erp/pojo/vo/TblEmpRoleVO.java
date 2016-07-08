package com.hvh.erp.pojo.vo;

import com.hvh.erp.pojo.TblEmp;

public class TblEmpRoleVO {

	private TblEmp tblEmp;
	private Long[] roleUuids;

	public TblEmp getTblEmp() {
		return tblEmp;
	}

	public void setTblEmp(TblEmp tblEmp) {
		this.tblEmp = tblEmp;
	}


	public Long[] getRoleUuids() {
		return roleUuids;
	}

	public void setRoleUuids(Long[] roleUuids) {
		this.roleUuids = roleUuids;
	}

}
