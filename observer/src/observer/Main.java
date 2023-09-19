package observer;

public class Main {

	public static void main(String[] args) {
		
		ClockTimer timer = new ClockTimer();
		DigitalClock digitalClock = new DigitalClock(timer);

		while (true) {
            timer.tick();
            try {
                Thread.sleep(1000); // Odota sekunti ennen seuraavaa tikitystä
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}