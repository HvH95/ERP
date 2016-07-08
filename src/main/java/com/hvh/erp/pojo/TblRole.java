package com.hvh.erp.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_role")
public class TblRole implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7902068035219054797L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uuid;

	private String name;

	private String code;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}
}