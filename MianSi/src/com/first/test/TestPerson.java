package com.first.test;

public class TestPerson {
	public static void main(String[] args) {
		// 作为git修改下
		// equals方法默认就是==，只不过我们一般会equals方法重写
		Person person = new Person();
		person.setA(1);
		Person person2 = new Person();
		System.out.println(person.equals(person2));
		System.out.println(person == person2);
		System.out.println(person.hashCode());
		person.setB(1);
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());

	}
}
