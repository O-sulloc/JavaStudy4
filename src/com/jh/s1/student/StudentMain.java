package com.jh.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// make student 메서드를 여기서 호출해
		// 이름,국영수,번호 출력해
		// 입력은 make에서 받게 해

		StudentUtil su = new StudentUtil();

//		Student student = su.makeStudent();
		Student [] s = StudentUtil.makeStudents();
		System.out.println("이름: " + student.name);
		System.out.println("번호: " + student.number);
		System.out.println("국어: " + student.kor);
		System.out.println("영어: " + student.eng);
		System.out.println("수학: " + student.math);
		System.out.println("총점: " + student.total);
		System.out.println("평균: " + student.avg);
	}

}
