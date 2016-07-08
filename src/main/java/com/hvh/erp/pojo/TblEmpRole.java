package com.hvh.erp.pojo;

import java.io.Serializable;

import javax.persistence.Table;

@Table(name = "tbl_emp_role")
public class TblEmpRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3878382808376064541L;

	private Long uuid;

	private Long empuuid;

	private Long roleuuid;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public Long getEmpuuid() {
		return empuuid;
	}

	public void setEmpuuid(Long empuuid) {
		this.empuuid = empuuid;
	}

	public Long getRoleuuid() {
		return roleuuid;
	}

	public void setRoleuuid(Long roleuuid) {
		this.roleuuid = roleuuid;
	}
}