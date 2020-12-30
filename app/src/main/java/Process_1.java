import processing.core.PApplet;

public class Process_1 extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int X_Position_Of_Ball_One = 0;
    private int X_Position_Of_Ball_Two = 0;
    private int X_Position_Of_Ball_Three= 0;
    private int X_Position_Of_Ball_Four = 0;
    private int Y_Position_Of_Ball_One = 1 * HEIGHT / 5;
    private int Y_Position_Of_Ball_Two = 2 * HEIGHT / 5;
    private int Y_Position_Of_Ball_Three= 3 * HEIGHT / 5;
    private int Y_Position_Of_Ball_Four = 4 * HEIGHT / 5;
    private int speed_Of_Ball_One = 1;
    private int speed_Of_Ball_Two = 2;
    private int speed_Of_Ball_Three= 3;
    private int speed_Of_Ball_Four = 4;

    public static void main(String  args[]) {
        PApplet.main("Process_1", args);
    }

    @Override
    public void settings() {
        size(HEIGHT, WIDTH);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(X_Position_Of_Ball_One, Y_Position_Of_Ball_One, DIAMETER, DIAMETER);
        X_Position_Of_Ball_One += speed_Of_Ball_One;
    }

    private void drawCircle2() {
        ellipse(X_Position_Of_Ball_Two, Y_Position_Of_Ball_Two, DIAMETER, DIAMETER);
        X_Position_Of_Ball_Two += speed_Of_Ball_Two;
    }

    private void drawCircle3() {
        ellipse(X_Position_Of_Ball_Three, Y_Position_Of_Ball_Three, DIAMETER, DIAMETER);
        X_Position_Of_Ball_Three += speed_Of_Ball_Three;
    }

    private void drawCircle4() {
        ellipse(X_Position_Of_Ball_Four, Y_Position_Of_Ball_Four, DIAMETER, DIAMETER);
        X_Position_Of_Ball_Four += speed_Of_Ball_Four;
    }
}