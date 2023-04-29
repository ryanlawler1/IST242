public class Gold extends Item {

    public int amt;

    public Gold(int amt){
        super("Gold bar", String.format("A round coin that was floating in space.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}

