package com.hvh.erp.action;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hvh.erp.pojo.TblDep;
import com.hvh.erp.pojo.vo.TblDepVO;
import com.hvh.erp.service.TblDepService;

@Controller
@RequestMapping("/dep")
public class DepAction {

	@Autowired
	private TblDepService tblDepService;

	// 展示页面
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<TblDep> tblDepList = tblDepService.queryAll();
		model.addAttribute("tblDepList", tblDepList);
		return "dep/dep_list";
	}

	// 添加页面
	@RequestMapping("/addView")
	public String addView() {
		return "dep/dep_add";
	}

	// 添加数据
	@RequestMapping("/add")
	public String add(TblDepVO vo) throws Exception {
		tblDepService.save(vo.getTblDep());
		return "redirect:/dep/dep_list.action";
	}

	// 修改页面
	@RequestMapping("/editView")
	public String editView(Model model, Long uuid) throws Exception {
		TblDep tblDep = tblDepService.queryById(uuid);
		model.addAttribute("tblDep", tblDep);
		return "dep/dep_edit";
	}

	// 修改数据
	@RequestMapping("/edit")
	public String edit(TblDepVO vo) throws Exception {
		tblDepService.update(vo.getTblDep());
		return "redirect:/dep/dep_list.action";
	}

	// 删除数据
	@RequestMapping("/delete/{uuid}")
	public String delete(@PathVariable Long uuid) throws Exception {
		tblDepService.deleteById(uuid);
		return "redirect:/dep/dep_list.action";
	}

}
