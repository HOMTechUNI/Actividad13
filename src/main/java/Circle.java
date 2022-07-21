import java.awt.*;

public class Circle extends Dot{
    int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics circle) {
        circle.drawOval(x, y, radius*2, radius*2);
    }
}