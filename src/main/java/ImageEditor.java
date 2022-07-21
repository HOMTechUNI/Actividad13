public class ImageEditor {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        Dot dot = new Dot(7, 6);
        Circle circle = new Circle(100, 521, 94);
        //Adding Dot to CompoundGraphic
        graphic.add(dot);
        //Adding Circle to CompoundGraphic
        graphic.add(circle);
        //Printing CompoundGraphics
        graphic.draw();
        //Moving all elements of CompoundGraphic to x = 73, y = 32
        graphic.move(73, 32);
        //Printing CompoundGraphic after moving
        graphic.draw();
        //Removing Circle from CompoundGraphic
        graphic.remove(circle);
        //Printing CompoundGraphic after removing Circle
        graphic.draw();
    }
}
