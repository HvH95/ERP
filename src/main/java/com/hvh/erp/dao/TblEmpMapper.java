package com.hvh.erp.dao;

import com.github.abel533.mapper.Mapper;
import com.hvh.erp.pojo.TblEmp;

public interface TblEmpMapper extends Mapper<TblEmp> {

	public TblEmp findUserLogin(TblEmp tblEmp) throws Exception;

}