public class PrintSym implements Runnable {
	private int threadNum;
	private int numberPrint;

	public PrintSym(int np, int n) {
		numberPrint = np;
		threadNum = n;
	}

	public void run() {
		for (int i = 1; i <= numberPrint; i++) {
			System.out.println("Thread: " + threadNum + " print #" + i);
		}
	}
}