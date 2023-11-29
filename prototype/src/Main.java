public class Main {
    public static void main(String[] args) {
        Pointer protoHourPointer = new Pointer(12);
        Pointer protoMinPointer = new Pointer(0);

        Clock protoClock = new Clock(protoHourPointer, protoMinPointer);

        try {
            // deep copy
            // clone from proto
            Clock cloneClock = (Clock) protoClock.clone();

            System.out.println("Syväkopiointi:");
            System.out.println("Alkuperäinen kello: " + protoClock.getHourPointer().getTime() + ":"
                    + protoClock.getMinPointer().getTime());
            System.out.println("Klooni kello: " + cloneClock.getHourPointer().getTime() + ":"
                    + cloneClock.getMinPointer().getTime());

            // change proto time
            protoClock.getHourPointer().setTime(12);
            protoClock.getMinPointer().setTime(1);

            System.out.println("Alkuperäisen kellon muutoksen jälkeen");
            System.out.println("Alkuperäinen kello: " + protoClock.getHourPointer().getTime() + ":"
                    + protoClock.getMinPointer().getTime());
            System.out.println("Klooni kello: " + cloneClock.getHourPointer().getTime() + ":"
                    + cloneClock.getMinPointer().getTime());

            // shallow copy
            Clock shallowCloneClock = protoClock.shallowClone();

            System.out.println("Matalakopionti:");
            System.out.println("Alkuperäinen kello: " + protoClock.getHourPointer().getTime() + ":"
                    + protoClock.getMinPointer().getTime());
            System.out.println("Klooni kello: " + shallowCloneClock.getHourPointer().getTime() + ":"
                    + shallowCloneClock.getMinPointer().getTime());

            protoClock.getHourPointer().setTime(12);
            protoClock.getMinPointer().setTime(2);

            System.out.println("Alkuperäisen kellon muutoksen jälkeen");
            System.out.println("Alkuperäinen kello: " + protoClock.getHourPointer().getTime() + ":"
                    + protoClock.getMinPointer().getTime());
            System.out.println("Klooni kello: " + shallowCloneClock.getHourPointer().getTime() + ":"
                    + shallowCloneClock.getMinPointer().getTime());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
