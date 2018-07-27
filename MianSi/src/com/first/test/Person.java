package com.first.test;

public class Person {
	int a;
	int b;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean result = false;

		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (person.getA() == a && person.getB() == b) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
