public class MarsRoom extends EnemyRoom{
    Martian enemy;

    public MarsRoom(int x, int y, Martian enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A Martian appears!";
        }else{
            return "A Martian's corpse floats past you.";
        }
    }
}