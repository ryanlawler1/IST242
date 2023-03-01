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

        Enemy enemy = new Enemy("Scary Enemy", 100, 50);

        Ogre greenOgre = new Ogre(Spear.poisonSpear);

        Ogre redOgre = new Ogre(Spear.fireSpear);

        Zombie slowZombie = new Zombie(Bite.zombieBite);

        Zombie fastZombie = new Zombie(Bite.zombieBite);

        Dog spotDog = new Dog(Bite.dogBite);

        GiantSpider redGiantSpider = new GiantSpider(spiderAttack.webAttack);

        Ryan ryanRyan = new Ryan(ryanMoves.powerPunch);

        Action action = new Action(Method.Jump, "Jump", 'j', null);
        //New Action Class

        MoveEast moveEast = new MoveEast();

        MoveNorth moveNorth = new MoveNorth();

        MoveSouth moveSOuth = new MoveSouth();

        MoveWest moveWest = new MoveWest();

        Flee flee = new Flee();

        ViewInventory viewInventory = new ViewInventory();

        RyanAction ryanAction = new RyanAction();
        //Ryan Action











        Gameboard gameboard = new Gameboard("Tic Tac Toe");
            System.out.println(gameboard.name);

        Player player1 = new Player("Ryan", (short)100, (short)10, true );



        Player player2 = new Player("Joe", (short)0, (short)100, true );

    }
}