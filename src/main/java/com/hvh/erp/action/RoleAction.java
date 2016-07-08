package com.hvh.erp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hvh.erp.pojo.TblRole;
import com.hvh.erp.service.TblRoleService;

@Controller
@RequestMapping("/role")
public class RoleAction {

	@Autowired
	private TblRoleService tblRoleService;

	// 展示页面
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<TblRole> tblRoleList = tblRoleService.queryAll();
		model.addAttribute("tblRoleList", tblRoleList);
		return "role/role_list";
	}

	// 添加页面
	@RequestMapping("/addView")
	public String addView(Model model) {
		return "role/role_add";
	}

	// 添加数据
	@RequestMapping("/add")
	public String add(TblRole tblRole) throws Exception {
		tblRoleService.save(tblRole);
		return "redirect:/role/list.action";
	}

	// 修改页面
	@RequestMapping("/editView")
	public String editView(Model model, Long uuid) throws Exception {
		TblRole tblRole = tblRoleService.queryById(uuid);
		model.addAttribute("tblRole", tblRole);
		return "role/role_edit";
	}

	// 修改数据
	@RequestMapping("/edit")
	public String edit(TblRole tblRole) throws Exception {
		tblRoleService.updateSelective(tblRole);
		return "redirect:/role/list.action";
	}

	// 删除数据
	@RequestMapping("/delete")
	public String delete(Long uuid) throws Exception {
		tblRoleService.deleteById(uuid);
		return "redirect:/role/list.action";
	}
}
