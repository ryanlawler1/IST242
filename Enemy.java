public class Enemy {


    protected String name;
    protected int hp;
    protected int damage;
    protected String color;
    protected String size;


    public Enemy(String name, int hp, int damage,String color, String size){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.color = color;
        this.size = size;
    }

    public boolean is_alive(){
        return (this.hp > 0);
    }
}
