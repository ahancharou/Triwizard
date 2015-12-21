package Champions;

public enum Champions {
    HARRY_POTTER ("Potter"),
    CEDRIC_DIGGORY ("Diggory"),
    FLEUR_DELACOUR ("Delacour");

    private final String power;

    private Champions (String power){
        this.power = power;
    }

    public String toString(){
        return power;
    }
}
