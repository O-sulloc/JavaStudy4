package com.jh.s1.student;

import java.util.Scanner;

public class StudentUtil {
	public Student [] makeStudents() {
		// 학생 수 입력받고 그 수만큼 국영수이름번호 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		Student[] s = new Student[count]; // 배열 선언

		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("번호를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("국어 성적을 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int math = sc.nextInt();
			st[i]=s;
		}
		return st;
	}

	public Student makeStudent() { // 메서드 선언
		// 변수 하나만 리턴할 수 있는데 어떻게 국영수이름번호 다 리턴할건지 고민해봐
		// 배열은 못쓴다. 이름은 스트링이고 나머지는 인트라
		// 그래서 class를 하나 만들어야 한다.

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("번호를 입력하세요.");
		int number = sc.nextInt();
		System.out.println("국어 성적을 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int math = sc.nextInt();

		Student student = new Student();
		student.name = name;
		student.number = number;
		student.kor = kor;
		student.eng = eng;
		student.math = math;

		return student;
	}
}
