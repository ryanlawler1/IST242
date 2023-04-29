public class EarthRoom extends MapTile {

    public EarthRoom(int x, int y){super(x,y);}

    public String intro_text(){
        return "\n You have to evacuate Earth! \n Get in the rocket ship and get out of here!";
    }

    public void modify_player(Player player){

    }
}

