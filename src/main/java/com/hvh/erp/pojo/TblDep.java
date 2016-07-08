package com.hvh.erp.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_dep")
public class TblDep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uuid;

	private String name;

	private String tele;

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

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele == null ? null : tele.trim();
	}
}