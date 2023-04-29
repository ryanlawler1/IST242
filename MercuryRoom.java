public class MercuryRoom extends LootRoom{
    public MercuryRoom(int x, int y, Axe axe){
        super(x, y, axe);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You arrive at Mercury. A planet not inhabited by humans.");
        else
            return "";
    }
}