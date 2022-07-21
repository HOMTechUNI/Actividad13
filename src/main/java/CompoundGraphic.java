import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    private ArrayList<Graphic> children=new ArrayList<>();
    @Override
    public void move(int x,int y){
        for (Graphic g:children) g.move(x,y);
    }
    @Override
    public void draw(){
        for (Graphic g:children) g.draw();
    }

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }

}
