public class VenusRoom extends LootRoom{
    public VenusRoom(int x, int y, Sword sword){
        super(x, y, sword);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You arrive at Venus. A planet not inhabited by humans.");
        else
            return "";
    }
}