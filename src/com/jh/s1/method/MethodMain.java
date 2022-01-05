package com.jh.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		// 리턴스터디에 있는 test1 불러오고 싶어. 그러니까 객체 만들어
		// how? new 클래스명 ();

		ReturnStudy rs = new ReturnStudy();

		// 참조변수명.멤버들
		rs.test1();

		int count = rs.test2();
		System.out.println("Main: " + count);

		String name = rs.test3();
		System.out.println("My name is " + name);

		double number = Math.random();
		System.out.println("math.random: " + number);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("age: " + age);
		
		System.out.println("MainMethod Finish");
	}

}
