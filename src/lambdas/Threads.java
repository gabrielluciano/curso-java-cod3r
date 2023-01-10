package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable tarefa1 = new Tarefa1();
		
		Runnable tarefa2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Tarefa #02");
				}
			}
		};
		
		Runnable tarefa3 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Tarefa #03");
			}
		};
		
		Runnable tarefa4 = Threads::tarefa4;
		
		Thread t1 = new Thread(tarefa1);
		Thread t2 = new Thread(tarefa2);
		Thread t3 = new Thread(tarefa3);
		Thread t4 = new Thread(tarefa4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	private static void tarefa4() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tarefa #04");
		}
	}
}
