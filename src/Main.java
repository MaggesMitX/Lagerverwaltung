import java.util.Scanner;
public class Main {
    /**
     * @param args Bilden die sogenannten Parameter der Methode. Damit kannst du Werte,
     * in Form eines Arrays, aus der Kommandozeile deines Computers an die Java Main übergeben
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Erstelle Scanner Objekt
        int operator = 0;                       // Variable die für die Menüauswahl verwendet wird
        Lager lg1 = new Lager( 500);

        while (operator != 5){
            System.out.println("------------------------------------------------------------");
            System.out.println("Willkommen im Lagerverwaltungssystem");
            System.out.println("(1) Artikel hinzufügen");
            System.out.println("(2) Artikel entnehmen");
            System.out.println("(3) Eintrag suchen");
            System.out.println("(4) Lager als Tabelle ausgeben");
            System.out.println("(5) Beende das Programm");
            System.out.println("------------------------------------------------------------");
            System.out.println("Bitte wählen Sie aus welche Aktion Sie tätigen wollen:");

            operator = myObj.nextInt();  // Read user input

            /**
             * Switch: Hier findet die Logik der Menüauswahl statt.
             */

            switch(operator){
                case 1:

                    System.out.println("Bitte geben Sie den Namen des Artikels an: ");
                    String nameOfArticle = myObj.next();  // Read user input

                    System.out.println("Bitte geben Sie die Anzahl der Artikel an: ");
                    int valOfArticle = myObj.nextInt();  // Read user input
                    lg1.addArtikel(new Artikel(nameOfArticle,valOfArticle ));

                    System.out.println("Der Artikel wurde hinzugefügt!");
                    break;

                case 2:

                    System.out.println("Bitte geben Sie an, welchen Artikel Sie entnehmen möchten: ");
                    String nameOfremoveArticle = myObj.next();  // Read user input

                    System.out.println("Bitte geben Sie die Anzahl der Artikel an: ");
                    int valueOfArticle = myObj.nextInt();  // Read user input

                    lg1.removeArticle(new Artikel(nameOfremoveArticle,valueOfArticle ));
                    System.out.println("Artikel wurde entfernt!");

                    break;
                case 3:
                    System.out.println("Bitte geben Sie an, welchen Artikel Sie suchen möchten: ");
                    String nameOfsearchedArticle = myObj.next();  // Read user input

                    if (lg1.findArtikel(nameOfsearchedArticle)){
                        System.out.println(nameOfsearchedArticle + " Wurde gefunden!");
                    }else{
                        System.out.println(nameOfsearchedArticle + " Wurde nicht gefunden!");
                    }
                    break;
                case 4:
                    for (Artikel tmpA: lg1.getArtikelListe()
                    ) {
                        if (tmpA != null)
                            System.out.println("Name: " + tmpA.getName() + "\nAnzahl: " + tmpA.getAmount());
                    }
                    break;
                case 5:
                    System.out.println("Auf Wiedersehen.");
                    return;
            }
        }
    }
}