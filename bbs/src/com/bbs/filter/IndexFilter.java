package com.bbs.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/jsp/*" })
public class IndexFilter implements Filter {

    public IndexFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/*
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String url = httpServletRequest.getRequestURI();
        
        
        if(url != null && url.endsWith(".jsp")) {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath());
            return;
        }
        chain.doFilter(request, response);
		*/
        
        HttpServletRequest httpRequest = (HttpServletRequest) (request);
        HttpServletResponse httpResponse = (HttpServletResponse) (response);

        HttpSession session = httpRequest.getSession();
        
        String valiate = (String)session.getAttribute("valiate");
        
        if (!("true".equals(valiate))) {
        	//跳转到登录页面 
        	System.out.println("非法用户");
        	httpResponse.sendRedirect("/bbs/index.jsp");
        	}
        chain.doFilter(request, response);
		
		//HttpServletResponse req = (HttpServletResponse)response;
		//req.sendRedirect("index.jsp");
		//chain.doFilter(request, response);
        
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
