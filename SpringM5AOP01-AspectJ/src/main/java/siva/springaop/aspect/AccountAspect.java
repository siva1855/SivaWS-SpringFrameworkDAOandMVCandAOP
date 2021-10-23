package siva.springaop.aspect;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AccountAspect {
	
	@Pointcut("execution(* siva.springaop.service.*.*(..))")
	public void pointCutMethod() {
	}

	@Before(value = "pointCutMethod()")
	public void pinVerification(JoinPoint joinPoint) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter pin :");
		int pin = scanner.nextInt();
		if (pin == 9861) {
			System.out.println("pin verification success");
		} else {
			System.out.println("wrong pin entered.....please check");
			System.exit(0);
		}

	}

}
