package observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockTimer extends Observable {
	
	private int h, min, s;

	public ClockTimer() {
		h = 0;
		min = 0;
		s = 0;
	}

	public int getSecond() {
		return s;
	}

	public int getMinute() {
		return min;
	}

	public int getHour() {
		return h;
	}
	
	public void tick() {
        s++;
        if (s == 60) {
            s = 0;
            min++;
            if (min == 60) {
                min = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
                System.out.println(h + ":" + min + ":" + s);
            }
        }
    setChanged();
	notifyObservers(this);
	}
}
