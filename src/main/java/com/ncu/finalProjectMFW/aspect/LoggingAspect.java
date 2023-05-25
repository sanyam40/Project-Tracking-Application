package com.ncu.finalProjectMFW.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* com.ncu.finalProjectMFW.controller.AdminController.*(..)")
	public void myPointcut() {}
	
	@Before("MyPointcut()")
	public void MyBefore() {
		System.out.println("Admin's Method is executing");
	}
	
	@After("MyPointcut()")
	public void MyAfter() {
		System.out.println("Admin's Method is executed");
	}
	
	@Pointcut("execution(* com.ncu.finalProjectMFW.controller.UserController.*(..)")
	public void myPointcut2() {}
	
	@Before("MyPointcut()")
	public void MyBefore2() {
		System.out.println("User's Method is executing");
	}
	
	@After("MyPointcut()")
	public void MyAfter2() {
		System.out.println("User's Method is executed");
	}
	
	@Pointcut("execution(* com.ncu.finalProjectMFW.controller.LoginController.*(..)")
	public void myPointcut3() {}
	
	@Before("MyPointcut()")
	public void MyBefore3() {
		System.out.println("User's Method is executing");
	}
	
	@After("MyPointcut()")
	public void MyAfter3() {
		System.out.println("User's Method is executed");
	}	
}
