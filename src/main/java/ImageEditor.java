public class ImageEditor {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        Dot dot = new Dot(7, 6);
        Circle circle = new Circle(100, 521, 94);
        System.out.println("Adding Dot to CompoundGraphic\n");
        graphic.add(dot);
        System.out.println("Adding Circle to CompoundGraphic\n");
        graphic.add(circle);
        System.out.println("Printing CompoundGraphic:\n");
        graphic.draw();
        System.out.println("Moving all elements of CompoundGraphic to x = 73, y = 32\n");
        graphic.move(73, 32);
        System.out.println("Printing CompoundGraphic after moving\n");
        graphic.draw();
    }
}
