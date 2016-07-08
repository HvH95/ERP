package com.hvh.erp.action.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception {
		// String url = request.getRequestURI();
		// if (url.indexOf("loginView.action") >=
		// 0||url.indexOf("loginsubmit.action")>=0) {
		// return true;
		// }
		//
		// HttpSession session=request.getSession();
		// String usercode=(String) session.getAttribute("usercode");
		// if(usercode!=null){
		// return true;
		// }
		// System.out.println(request.getContextPath());
		// //request.getRequestDispatcher(request.getContextPath()+"/loginView.ation").forward(request,
		// response);;
		// response.sendRedirect(request.getContextPath()+"/loginView.action");
		// return false;
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception ex)
			throws Exception {

	}

}
