import java.util.ArrayList;

public class CompountGraphic implements Graphic{
    ArrayList<Graphic> children=new ArrayList<>();
    @Override
    public void move(int x,int y){
        for (Graphic g:children) g.move(x,y);
    }
    @Override
    public void draw(){

    }

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }

}
