package com.song.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Auther: songlijun
 * @Date: 2020/6/5
 * @Description: com.song.filter
 * @version: 1.0
 */
@WebFilter(filterName="FirstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入filter------");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开filter----");
    }

    @Override
    public void destroy() {

    }
}
