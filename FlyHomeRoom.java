import java.util.ArrayList;
public class FlyHomeRoom extends MapTile {
    public FlyHomeRoom(int x, int y){super(x,y);}

    @Override
    public ArrayList<Action> available_actions(){
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action(null,"Fly Home",'f',null));

        return actions;
    }

    public String intro_text(){
        return "\n Earth is finally safe! You can fly home! ";
    }
}
