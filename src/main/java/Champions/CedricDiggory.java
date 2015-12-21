package Champions;

import java.util.Random;

public class CedricDiggory extends Champion {

    public int compete(){
        score=score+strength();
        return score;
    }

    private int strength(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
