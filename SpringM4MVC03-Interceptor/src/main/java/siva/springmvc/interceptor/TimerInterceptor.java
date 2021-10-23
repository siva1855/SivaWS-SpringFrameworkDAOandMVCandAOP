package siva.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimerInterceptor extends HandlerInterceptorAdapter {

	private long x;
	private long y;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		x = System.currentTimeMillis();
		System.out.println("Time Taken to preHandler request is :" + x + " millis");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		y = System.currentTimeMillis();
		System.out.println("Time taken to handle the request is :" + (y - x) + " millis");

	}

}
