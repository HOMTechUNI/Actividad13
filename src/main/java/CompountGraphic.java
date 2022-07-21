import java.awt.*;
import java.util.ArrayList;

public class CompountGraphic implements Graphic{
    ArrayList<Graphic> children=new ArrayList<>();
    @Override
    public void move(int x,int y){
        for (Graphic g:children) g.move(x,y);
    }
    @Override
    public void draw(Graphics graphic){
        for (Graphic g:children) g.draw(graphic);
    }

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }

}
