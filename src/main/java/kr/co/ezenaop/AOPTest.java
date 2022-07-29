package kr.co.ezenaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {

		// 빈을 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("aoptest.xml");
		
		// id가 proxyCal인 빈 접근
		Calculator cal = (Calculator) context.getBean("proxyCal");
		
		//메서드 호출 전후에 어드바이스 빈이 적용됨
		cal.add(100, 20);
		System.out.println();
		
		cal.substract(100, 20);
		System.out.println();
		
		cal.multiply(100, 20);
		System.out.println();
		
		cal.divide(100, 20);
	}

}
