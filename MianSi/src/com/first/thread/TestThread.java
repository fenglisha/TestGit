package com.first.thread;

//��ֹ�߳�ִ�� :1˯��Thread.sleep(long millis)2�ȴ�;3��Ҫһ�������������������;

//�̵߳����ȼ����߳��ò�yield();
//�����̵߳����ȼ�setPriority();�߳�Ĭ�����ȼ���5
//join()����;��һ���߳�B�����롱������һ���߳�A��β��
public class TestThread extends Thread {
	private String name;

	public TestThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// һ�����߳�run������ִ��ѭ���Ĳ���.������ִ��ĳЩ���ӵĲ���
		for (int i = 0; i < 5; i++) {
			// ������ҵ���ӵ��¼���
			for (long k = 0; k < 1000; k++)
				;

			System.out.println("�����߳�" + name + i);
		}

	}

	public static void main(String[] args) {
		// �����߳�1��
		TestThread testThread = new TestThread("x");
		// �����߳�2��
		TestThread testThread2 = new TestThread("y");
		// ��ʼ�����߳�
		testThread.start();
		testThread2.start();

	}
}
