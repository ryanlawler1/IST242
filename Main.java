public class Main {
    public static void main(String[] args) {

        Gold goldbar = new Gold(10);
        Weapon weapon = new Weapon("Super Weapon",
                "super 2 weapon",
                10,
                50);
        weapon.setDamage(40);
        int dvalue = weapon.getDamage();

        Sword magicSword = new Sword();

        Pillow softPillow = new Pillow();

        Mace bigMace = new Mace();

        Arrow pointyArrow = new Arrow();

    }
}