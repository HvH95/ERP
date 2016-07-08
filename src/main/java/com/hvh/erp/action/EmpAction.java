package com.hvh.erp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hvh.erp.pojo.TblDep;
import com.hvh.erp.pojo.TblEmp;
import com.hvh.erp.pojo.TblRole;
import com.hvh.erp.pojo.vo.TblEmpRoleVO;
import com.hvh.erp.service.TblDepService;
import com.hvh.erp.service.TblEmpService;
import com.hvh.erp.service.TblRoleService;

@Controller
@RequestMapping("/emp")
public class EmpAction {

	@Autowired
	private TblEmpService tblEmpService;
	@Autowired
	private TblRoleService tblRoleService;
	@Autowired
	private TblDepService tblDepService;

	// 展示页面
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<TblEmp> tblEmpList = tblEmpService.queryAll();
		model.addAttribute("tblEmpList", tblEmpList);
		return "emp/emp_list";
	}

	// 添加页面
	@RequestMapping("/addView")
	public String addView(Model model) {
		List<TblRole>roleList=tblRoleService.queryAll();
		List<TblDep>depList=tblDepService.queryAll();
		model.addAttribute("roleList", roleList);
		model.addAttribute("depList", depList);
		return "emp/emp_add";
	}

	// 添加数据
	@RequestMapping("/add")
	public String add(TblEmpRoleVO tblEmpRoleVO) throws Exception {
		tblEmpService.insertEmpInfo(tblEmpRoleVO);
		return "redirect:/emp/list.action";
	}

	// 修改页面
	@RequestMapping("/editView")
	public String editView(Model model, Long uuid) throws Exception {
		TblEmp tblEmp = tblEmpService.queryById(uuid);
		List<TblRole>list=tblRoleService.queryAll();
		model.addAttribute("tblEmp", tblEmp);
		model.addAttribute("list", list);
		return "emp/emp_edit";
	}

	// 修改数据
	@RequestMapping("/edit")
	public String edit(TblEmp tblEmp) throws Exception {
		tblEmpService.updateSelective(tblEmp);
		return "redirect:/emp/list.action";
	}

	// 删除数据
	@RequestMapping("/delete")
	public String delete(Long uuid) throws Exception {
		tblEmpService.deleteById(uuid);
		return "redirect:/emp/list.action";
	}

	// 查找员工
	@RequestMapping("/query")
	public String query(TblEmp tblEmp, Model model) throws Exception {
		List<TblEmp> tblEmpList = tblEmpService.queryListByWhere(tblEmp);
		model.addAttribute("tblEmpList", tblEmpList);
		return "emp/emp_list";
	}
}
