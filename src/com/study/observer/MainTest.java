package com.study.observer;

public class MainTest {
	public static void main(String[] args) {
		School school = new School();
		Student student = new Student();
		Teacher teacher = new Teacher();
		school.attach(student);
		school.attach(teacher);
		school.notifyObervers();
	}
}
