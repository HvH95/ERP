package com.hvh.erp.action;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hvh.erp.pojo.TblEmp;
import com.hvh.erp.service.TblEmpService;


@Controller
public class LoginAction {
	
	@Autowired
	private TblEmpService tblEmpService;
	
	@RequestMapping("/loginView")
	public String loginView() throws Exception{
		
		
		return "login/login";
	}
	
	@RequestMapping("/loginsubmit")
	public String loginsubmit(HttpSession session,Model model,String username,String pwd) 
			throws Exception{
		TblEmp tblemp=new TblEmp();
		tblemp.setUsername(username);
		tblemp.setPwd(pwd);
		TblEmp obj=tblEmpService.findUserLogin(tblemp);
		if(obj==null){
			model.addAttribute("error","输入错误");
			return "login/login";
		}
		session.setAttribute("usercode",obj.getUsername());
		return "index";
	}
	
	@RequestMapping("/loginout")
	public String loginout(HttpSession session) throws Exception{
		
		//session失效
		session.invalidate();
		return "redirect:/WEB-INF/index.jsp";
	}
}
