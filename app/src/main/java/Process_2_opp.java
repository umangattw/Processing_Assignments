import processing.core.PApplet;

public class Process_2_opp extends PApplet
{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

    public  static void main(String args[])
    {
        PApplet.main("Process_2_opp", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(0, 1 * HEIGHT / 5, 1);
        ball2 = new Ball(0, 2 * HEIGHT / 5, 2);
        ball3 = new Ball(0, 3 * HEIGHT / 5, 3);
        ball4 = new Ball(0, 4 * HEIGHT / 5, 4);
    }

    @Override
    public void draw()
    {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    public void drawCircle(Ball ball)
    {
        ellipse(ball.X_Position, ball.Y_Position, ball.DIAMETER, ball.DIAMETER);
        ball.X_Position += ball.speed;
    }
}
