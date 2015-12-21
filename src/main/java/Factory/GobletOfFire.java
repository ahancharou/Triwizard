package Factory;

import Champions.Champion;
import Champions.Champions;
import Champions.HarryPotter;
import Champions.CedricDiggory;
import Champions.FleurDelacour;

import java.util.HashMap;
import java.util.Map;

public class GobletOfFire {
    private static GobletOfFire goblet;

    private static Map<String, Champion> poolOfChampions;

    public GobletOfFire(){
        poolOfChampions = new HashMap<String,Champion>();
    }

    public static GobletOfFire getInstance(){
        if (goblet == null) {
            return new GobletOfFire();
        } else
            return goblet;
    }

    public Champion getChampion(String power){
        if (poolOfChampions.containsKey(power)){
            return poolOfChampions.get(power);
        } else {
            Champion champion;
            if (power.equals(Champions.HARRY_POTTER.toString())) {
                champion = new HarryPotter();
            } else
                if (power.equals(Champions.CEDRIC_DIGGORY.toString())){
                    champion = new CedricDiggory();
                } else {
                    champion = new FleurDelacour();
                }
            poolOfChampions.put(power, champion);
            return champion;
        }
    }
}
