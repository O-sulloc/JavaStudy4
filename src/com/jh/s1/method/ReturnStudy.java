package com.jh.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {

	// 접근 지정자 [그외지정자] 리턴타입 메서드명 ([매개변수 선온]) {}
	
	public Scanner test4() {
		Scanner sc= new Scanner(System.in);
		
		return sc;
	}
	
	public String test3() {
		//키보드로 이름 입력받고 리턴하기
		Scanner sc = new Scanner (System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		return name;
	}
	
	public int test2() {
		Random random = new Random ();
		int num = random.nextInt();
		System.out.println("Test2: " + num);
		return num;
	}

	public void test1() {
		System.out.println("void는 리턴이 없을 때 사용");

	}
}
