public class FloatingGoldRoom extends LootRoom{

    public FloatingGoldRoom(int x, int y, Gold gold){
        super(x, y, gold);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice a gold coin floating in space! Quickly grab it an get back in the ship! ");
        else
            return "";
    }
}
