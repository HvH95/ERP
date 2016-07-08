package com.hvh.erp.service;

import java.util.List;

public abstract interface BaseService<T> {

	/**
	 * 根据id查询数据
	 * 
	 * @param id
	 * @return
	 */
	public T queryById(Long id);

	/**
	 * 查询所有数据
	 * 
	 * @return
	 */
	public List<T> queryAll();

	/**
	 * 根据条件查询一条数据
	 * 
	 * @param record
	 * @return
	 */
	public T queryOne(T record);

	/**
	 * 根据条件查询数据列表
	 * 
	 * @param record
	 * @return
	 */
	public List<T> queryListByWhere(T record);

	/**
	 * 分页查询数据列表
	 * 
	 * @param page
	 * @param rows
	 * @param record
	 * @return
	 */
	/*
	 * public PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T
	 * record) { // 设置分页参数 PageHelper.startPage(page, rows); List<T> list =
	 * this.mapper.select(record); return new PageInfo<T>(list); }
	 */

	/**
	 * 新增数据
	 * 
	 * @param t
	 * @return
	 */
	public Integer save(T t);

	/**
	 * 有选择的保存，选择不为null的字段作为插入字段
	 * 
	 * @param t
	 * @return
	 */
	public Integer saveSelective(T t);

	/**
	 * 更新数据
	 * 
	 * @param t
	 * @return
	 */
	public Integer update(T t);

	/**
	 * 有选择的更新，选择不为null的字段作为插入字段
	 * 
	 * @param t
	 * @return
	 */
	public Integer updateSelective(T t);

	/**
	 * 根据id删除数据
	 * 
	 * @param id
	 * @return
	 */
	public Integer deleteById(Long id);

	/**
	 * 批量删除
	 * 
	 * @param clazz
	 * @param property
	 * @param values
	 * @return
	 */
	public Integer deleteByIds(Class<T> clazz, String property,
			List<Object> values);

	/**
	 * 根据条件删除数据
	 * 
	 * @param record
	 * @return
	 */
	public Integer deleteByWhere(T record);

}