package com.first.test;

public class TestPerson {
	public static void main(String[] args) {
		// ��Ϊgit�޸���
		// equals����Ĭ�Ͼ���==��ֻ��������һ���equals������д
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
