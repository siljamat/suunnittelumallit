public class TestScreen {

    public static void main(String[] args){
        Screen screen = new Screen();
        Command switchUp = new FlipUpCommand(screen);
        Command switchDown = new FlipDownCommand(screen);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);
        button2.push();
        button1.push();
    }
}
