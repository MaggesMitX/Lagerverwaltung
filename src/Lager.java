
public class Lager {

   private Artikel[] artikelListe;

    /**
     * @param size Konstruktor: ist die Größe des Lagers, was man im SourceCode angeben kann.
     * Hiermit wird die Größe des Arrays bestimmt.
     */
   public Lager(int size){
       this.artikelListe = new Artikel[size];
   }

    /**
     * @return Diese this Methode returnt immer die aktuelle Liste mit dem Size Wert,
     * welchen man oben eingeben kann.
     */
   public Artikel[] getArtikelListe(){
       return this.artikelListe;
   }

    /**
     * @param artikel Checkt ob in meiner Artikelliste ein Nullpointer ist.
     */
   public void addArtikel(Artikel artikel){
       for (int i = 0; i < artikelListe.length; i++) {

           if (artikelListe[i] == null){            /**/
               artikelListe[i] = artikel;
               break;
           }
       }
   }

    /**
     * @param name Mit dieser Methode wo name enthalten ist kann der benutzer einen Artikel finden
     * welcher im Array ist
     * @return
     * Ist auch == "ruft equals auf".
     */
   public boolean findArtikel(String name){
       for (Artikel a:artikelListe
            ) {
           if (a != null && a.getName().equals(name)){
               System.out.println("");
               return true;
           }
       }
       return false;
   }

    /**
     * @param artikel Hier werden die Artikel(a) aus dem Array in einer for Schleife durchlaufen,
     * Ist auch == "ruft equals auf".
     */
   public void removeArticle(Artikel artikel){
       for (int i = 0; i < artikelListe.length; i++) {
           Artikel a =  artikelListe[i];
           if (a != null && a.getName().equals(artikel.getName())){

               if(a.getAmount()>= artikel.getAmount()){
                   a.verringerAnzahl(artikel.getAmount());
               }else{
                   artikelListe[i] = null;
               }
           }
       }
   }
}
