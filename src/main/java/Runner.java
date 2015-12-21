import Champions.Champion;
import Factory.Champions;
import Factory.GobletOfFire;

public class Runner {
    public static void main (String [] args) {
        GobletOfFire gobletOfFire = GobletOfFire.getInstance();
        int max = 0;
        String winner= "";
        for (Champions name : Champions.values()) {
            Champion champ = gobletOfFire.getChampion(name.toString());
            System.out.println(name);

            System.out.println(champ.compete());
            System.out.println(champ.getScore());
            System.out.println(champ.compete());
            System.out.println(champ.getScore());
            System.out.println(champ.fly());
            System.out.println(champ.getScore());

            if (max < champ.getScore()){
                max = champ.getScore();
                winner = name.toString();
            }

        }

        System.out.println("And the winner is "+ winner + " with score "+ max);

    }
}
