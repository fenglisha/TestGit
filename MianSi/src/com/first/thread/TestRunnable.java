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
			// 代表处理业务复杂的事件；
			for (long k = 0; k < 1000000; k++)
				;

			System.out.println("我是线程" + name + i);
		}
	}

	public static void main(String[] args) {
		TestRunnable runnable = new TestRunnable("x");
		TestRunnable runnable2 = new TestRunnable("y");
		// 创建线程还得用Thread,runnable只是重写了run方法，这样任何一个thread都可以调用run方法;
		// thread是先创建thread，再写run方法；
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable2);
		thread.start();
		thread2.start();
	}
}
