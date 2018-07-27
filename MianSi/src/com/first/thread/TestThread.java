package com.first.thread;

//阻止线程执行 :1睡眠Thread.sleep(long millis)2等待;3需要一个对象的锁定而被阻塞;

//线程的优先级和线程让步yield();
//设置线程的优先级setPriority();线程默认优先级是5
//join()方法;让一个线程B“加入”到另外一个线程A的尾部
public class TestThread extends Thread {
	private String name;

	public TestThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 一般在线程run方法中执行循环的操作.代表在执行某些复杂的操作
		for (int i = 0; i < 5; i++) {
			// 代表处理业务复杂的事件；
			for (long k = 0; k < 1000; k++)
				;

			System.out.println("我是线程" + name + i);
		}

	}

	public static void main(String[] args) {
		// 定义线程1；
		TestThread testThread = new TestThread("x");
		// 定义线程2；
		TestThread testThread2 = new TestThread("y");
		// 开始运行线程
		testThread.start();
		testThread2.start();

	}
}
