public class Dot implements Graphic {
    int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    @Override
    public void draw() {
        System.out.println("Printing Dot in x = " + x + ", y = " + y + "\n");
    }
}