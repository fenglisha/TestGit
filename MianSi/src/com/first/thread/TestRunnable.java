package com.first.thread;

public class TestRunnable implements Runnable {
	private String name;

	public TestRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			// ������ҵ���ӵ��¼���
			for (long k = 0; k < 1000000; k++)
				;

			System.out.println("�����߳�" + name + i);
		}
	}

	public static void main(String[] args) {
		TestRunnable runnable = new TestRunnable("x");
		TestRunnable runnable2 = new TestRunnable("y");
		// �����̻߳�����Thread,runnableֻ����д��run�����������κ�һ��thread�����Ե���run����;
		// thread���ȴ���thread����дrun������
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable2);
		thread.start();
		thread2.start();
	}
}
