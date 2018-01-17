package thread;

public class ThreadState implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(40);
				System.out.print(Thread.currentThread().getState() + ", ");
				System.out.println(Thread.currentThread().getName() + ": " + i);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException이 발생되어 스레드를 종료합니다.");
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("스레드의 모든 상태: 6 가지");
		
		
		for (Thread.State c : Thread.State.values())
			System.out.print(c + " ");
		System.out.println('\n');

		Thread th = new Thread(new ThreadState());
		System.out.println("기본 우선순위: " + th.getPriority());

		th.setPriority(Thread.NORM_PRIORITY + 2);
		System.out.println("우선순위 변경: " + th.getPriority());
		System.out.println("1 단계: " + th.getState());
		th.start();
		System.out.println("2 단계: " + th.getState());
		Thread.sleep(120);
		th.interrupt();
		System.out.println("3 단계: " + th.getState());
		Thread.sleep(1000);
		System.out.println("4 단계: " + th.getState());
	}

}
