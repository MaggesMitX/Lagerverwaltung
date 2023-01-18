public class Artikel {

    private String name;

    private int anzahl;

    /**
     * @param name Variable name für den Konstruktor.
     * @param anzahl Variable anzahl für den Konstruktor.
     */
    public Artikel(String name, int anzahl){
        this.name = name;
        this.anzahl = anzahl;
    }

    /**
     * @return Wiedergibt den AKTUELLEN benutzen Namen in die Methode an.
     */
    public String getName(){
        return this.name;
    }

    /**
     * @return Wiedergibt den AKTUELLEN Wert an anzahl in die Methode an.
     */
    public int getAmount(){
        return this.anzahl;
    }

    /**
     * @param anzahl Übergibt die Anzahl mit der this Methode. Das This sorgt dafür das man den Wert anzahl hier rüber übernehmen kann.
     *
     */
    public void setAnzahl(int anzahl){
        this.anzahl = anzahl;
    }

    /**
     * @param wert Mit dieser this Methode wird die Anzahl verringert.
     */
    public void verringerAnzahl(int wert){
        this.anzahl -= wert;
    }

}
