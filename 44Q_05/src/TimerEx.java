import java.util.*;

public class TimerEx {
	public static void actionPerformed() {
		System.out.println("beep");
	}

	public static void main(String[] args) {
		Timer m = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				actionPerformed();
			}
		};

		m.schedule(task, 1000, 1000);
	}
}