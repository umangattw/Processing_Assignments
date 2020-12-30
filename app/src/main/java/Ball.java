public class Ball
{
    public float X_Position;
    public float Y_Position;
    public int speed;
    public final float DIAMETER = 10.0f;
    public Ball(float X_Position, float Y_Position, int speed) {
        this.X_Position = X_Position;
        this.Y_Position = Y_Position;
        this.speed = speed;
    }
}