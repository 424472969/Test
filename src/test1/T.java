package test1;

import java.util.Timer;
import java.util.TimerTask;

public class T {
	public static void main(String args[]) throws java.io.IOException {
			TimerTask task = new TimerTask() {
				public void run() {
					System.out.print("Hi");
				}
			};
			Timer timer = new Timer();
			timer.schedule(task, 0, 1000);
			System.out.println("Press ENTER to stop");
			System.in.read(new byte[10]);
			timer.cancel();
	}
}











