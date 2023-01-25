import java.util.Scanner;

/**
 * Hauptprogramm zur verwaltung des Lagers
 */
public class Main {
    /**
     * Hauptmethode
     * @param args Bilden die sogenannten Parameter der Methode. Damit kannst du Werte,
     *             in Form eines Arrays, aus der Kommandozeile deines Computers an die Java Main übergeben.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Erstelle Scanner Objekt
        int operator = 0;                       // Variable die für die Menüauswahl verwendet wird
        Lager lg1 = new Lager(500);         // Größe kann Variable eingestellt werden des Arrays

        while (operator!=5) {
            System.out.println("---------------------------------------");
            System.out.println("Willkommen im Lagerverwaltungssystem");
            System.out.println("(1) Artikel hinzufügen");
            System.out.println("(2) Artikel entnehmen");
            System.out.println("(3) Eintrag suchen");
            System.out.println("(4) Lager als Tabelle ausgeben");
            System.out.println("(5) Beende das Programm");
            System.out.println("---------------------------------------");
            System.out.println("Bitte wählen Sie aus welche Aktion Sie tätigen wollen:");

            operator = scanner.nextInt();  /*Leser Benutzer eingabe mithilfe des Scanner Objektes*/

            /**
             * Auswahl Menü
             * Switch: Hier findet die Logik der Menüauswahl statt.
             */

            switch (operator) {
                case 1:
                                                                                                                /*Hinzufügen eines Artikels in das Lager lg1*/
                    System.out.println("Bitte geben Sie den Namen des Artikels an: ");
                    String nameOfArticle = scanner.next();

                    System.out.println("Bitte geben Sie die Anzahl der Artikel an: ");
                    int valOfArticle = scanner.nextInt();
                    lg1.addArtikel(new Artikel(nameOfArticle, valOfArticle));

                    System.out.println("Der Artikel wurde hinzugefügt!");
                    break;

                case 2:
                                                                                                             /*Artikel(Inhalte) aus dem Array entfernen*/
                    System.out.println("Bitte geben Sie an, welchen Artikel Sie entnehmen möchten: ");
                    String nameOfremoveArticle = scanner.next();

                    System.out.println("Bitte geben Sie die Anzahl der Artikel an: ");
                    int valueOfArticle = scanner.nextInt();

                    lg1.removeArticle(new Artikel(nameOfremoveArticle, valueOfArticle));
                    System.out.println("Artikel wurde entfernt!");

                    break;
                case 3:                                                                                      /*Suchen eines Eintrages aus dem Lager (Array)*/
                    System.out.println("Bitte geben Sie an, welchen Artikel Sie suchen möchten: ");
                    String nameOfsearchedArticle = scanner.next();

                    if (lg1.findArtikel(nameOfsearchedArticle)) {
                        System.out.println(nameOfsearchedArticle + " Wurde gefunden!");
                    } else {
                        System.out.println(nameOfsearchedArticle + " Wurde nicht gefunden!");
                    }
                    break;

                case 4:                                                                                       /*Gespeicherte Inhalte aus dem Array angeben*/
                    System.out.println("|----------------------------------------|");
                    System.out.println("| Name:         Anzahl:                          |");
                    int summeG = 0;
                    for (Artikel tmpA : lg1.getArtikelListe()
                    ) {
                        if (tmpA != null) {
                            System.out.println("-----------------------------------------|");
                            System.out.println("|"+tmpA.getName() + "       |       " + tmpA.getAmount()+"      |");
                            summeG += tmpA.getAmount();
                        }
                    }
                    System.out.println("|----------------------------------------|");
                    System.out.println("\n");
                    System.out.println("Insgesamte Artikel: "+ summeG);
                    break;

                case 5:
                    System.out.println("Auf Wiedersehen.");
            }
        }
    }
}