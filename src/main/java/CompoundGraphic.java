import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    private final ArrayList<Graphic> children=new ArrayList<>();
    @Override
    public void move(int x,int y){
        for (Graphic g:children) g.move(x,y);
    }
    @Override
    public void draw(){
        System.out.println("-------Start print Compound-------");
        for (Graphic g:children) g.draw();
        System.out.println("--------End print Compound--------");
    }

    public void add(Graphic graphic){
        children.add(graphic);
    }

    public void remove(Graphic graphic){
        children.remove(graphic);
    }

}
