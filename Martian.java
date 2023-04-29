public class Martian extends Enemy {

    private Laser laser;
    public Martian(Laser laser){
        super("Martian", 20, 15);
        this.laser = laser;
    }


}