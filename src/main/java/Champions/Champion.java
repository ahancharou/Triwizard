package Champions;

import java.util.Random;

public abstract class Champion implements DragonForm {
    int score;

    public int compete() {
        return score=+0;
    }

    public int fly(){
        Random random = new Random();
        int a = random.nextInt(100);
        score = score + a;
        return score;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}
