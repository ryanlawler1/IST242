public class Alien extends Enemy {

    private Laser laser;
    public Alien(Laser laser){
        super("Alien", 20, 15);
        this.laser = laser;
    }


}