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

        Enemy enemy = new Enemy("Scary Enemy", 100, 50,"Color","Size");

        Ogre greenOgre = new Ogre();

        Ogre redOgre = new Ogre();

        Zombie slowZombie = new Zombie();

        Zombie fastZombie = new Zombie();

        Dog spotDog = new Dog();

        GiantSpider redGiantSpider = new GiantSpider();

        Ryan ryanRyan = new Ryan();









        Gameboard gameboard = new Gameboard("Tic Tac Toe");
            System.out.println(gameboard.name);

        Player player1 = new Player("Ryan", (short)100, (short)10, true );



        Player player2 = new Player("Joe", (short)0, (short)100, true );

    }
}