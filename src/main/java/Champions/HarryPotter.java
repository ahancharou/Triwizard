package Champions;

import java.util.Random;

public class HarryPotter extends Champion {

     public int compete(){
        int a = lucky();
        score= score + a;
        return score;
    }

    private int lucky(){
        Random random = new Random();
        return random.nextInt(100);
    }
}
