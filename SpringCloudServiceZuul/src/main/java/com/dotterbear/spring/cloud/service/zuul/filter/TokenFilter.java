package com.dotterbear.spring.cloud.service.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class TokenFilter extends ZuulFilter {

	// before routing
	@Override
	public String filterType() {
		return "pre";
	}

	// filter order
	@Override
	public int filterOrder() {
		return 0;
	}

	// perform filter or not
	@Override
	public boolean shouldFilter() {
		return true;
	}

	// logical check for the filter
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		Object accessToken = request.getParameter("token");
		if (accessToken == null) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				ctx.getResponse().getWriter().write("token is empty");
			} catch (Exception e) {
			}

			return null;
		}
		return null;
	}
}