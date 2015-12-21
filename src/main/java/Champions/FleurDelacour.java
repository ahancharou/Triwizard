package Champions;

import java.util.Random;

public class FleurDelacour extends Champion{

    public int compete(){
        score=score +magic();
        return score;
    }

    private int magic() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
