import javax.swing.*;
public class ImageEditor extends JFrame {
    public ImageEditor() {
        setTitle("Image Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        Dot dot = new Dot(10, 10);
        Circle circle = new Circle(20, 20, 10);
        CompountGraphic graphic = new CompountGraphic();
        graphic.add(dot);
        graphic.add(circle);
        new ImageEditor();
    }
}
