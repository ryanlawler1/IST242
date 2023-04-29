public class AlienRoom extends EnemyRoom{
    Alien enemy;

    public AlienRoom(int x, int y, Alien enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " An Alien appears!";
        }else{
            return "An Alien's corpse floats past you.";
        }
    }
}