package observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DigitalClock implements Observer {
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct){
	timer = ct;
	timer.addObserver(this);
	}
	
	@Override
    public void update(Observable o, Object arg) {
        if (o instanceof ClockTimer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int min = timer.getMinute();
        int s = timer.getSecond();
        System.out.println("Digital clock " + hour + ":" + min + ":" + s);
    }
}
	
