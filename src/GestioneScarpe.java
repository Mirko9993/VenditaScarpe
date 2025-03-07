import java.util.Scanner;



public class GestioneScarpe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyShop myShop = new MyShop();


        System.out.println("Benvenuti in MyShop!");

        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  40, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  40, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  41, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  41, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  42, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  42, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  43, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike Dunk", 129.99, 10,  43, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  40, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  40, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  41, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  41, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  42, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  42, "Nera"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  43, "Bianca"));
        myShop.caricaScarpa(new Shoes("Nike air Force 1", 129.99, 10,  43, "Nera"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  40, "Bianca"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  40, "Nera"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  41, "Bianca"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  41, "Nera"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  42, "Bianca"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  42, "Nera"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  43, "Bianca"));
        myShop.caricaScarpa(new Shoes("Adidas Samba", 99.99, 10,  43, "Nera"));



        while (true) {

            System.out.println("\n1. Visualizza Prodotti");
            System.out.println("2. Acquista scarpa");
            System.out.println("3. Aggiungi/modifica/elimina scarpa");
            System.out.println("4. Gestisci pagamenti");
            System.out.println("5. Opzioni di spedizione");
            System.out.println("6. Gestisci reso/cambio");
            System.out.println("7. Monitoraggio delle scorte");
            System.out.println("8. Esci");
            System.out.print("Scegli un'opzione:\n ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    myShop.visualizzazioneProdotti();
                    break;
                case 2:
                    System.out.print("Scegliere il modello della scarpa da acquistare: ");
                    scanner.nextLine();
                    String modello = scanner.nextLine();
                    System.out.print("Scegliere la taglia: ");
                    int taglia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Scegliere il colore: ");
                    String colore = scanner.nextLine();
                    myShop.acquista(modello, taglia, colore);
                    break;
                case 3:
                    System.out.println("1. Aggiungere modello ");
                    System.out.println("2. Modificare modello ");
                    System.out.println("3. Eliminare modello ");
                    int sceltaGestione = scanner.nextInt();
                    switch (sceltaGestione) {
                        case 1:
                            System.out.print("Inserire il modello: ");
                            scanner.nextLine();
                            modello = scanner.nextLine();
                            System.out.print("Inserire il prezzo: ");
                            double prezzo = scanner.nextDouble();
                            System.out.print("Inserire la quantità: ");
                            int quantita = scanner.nextInt();
                            System.out.print("Inserire la taglia: ");
                            taglia = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Inserire il colore: ");
                            colore = scanner.nextLine();
                            myShop.caricaScarpa(new Shoes(modello, prezzo, quantita, taglia, colore));
                            break;
                        case 2:
                            System.out.print("Inserisci il modello della scarpa da modificare: ");
                            scanner.nextLine();
                            modello = scanner.nextLine();
                            System.out.print("Inserire la taglia: ");
                            taglia = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Inserire il colore: ");
                            colore = scanner.nextLine();
                            System.out.print("Inserire il nuovo prezzo: ");
                            prezzo = scanner.nextDouble();
                            System.out.print("Inserire la nuova quantità: ");
                            quantita = scanner.nextInt();
                            myShop.modifica(modello, taglia, colore, prezzo, quantita);
                            break;
                        case 3:
                            System.out.print("Inserisci il modello della scarpa da eliminare: ");
                            scanner.nextLine();
                            modello = scanner.nextLine();
                            System.out.print("Inserire la taglia: ");
                            taglia = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Inserire il colore: ");
                            colore = scanner.nextLine();
                            myShop.rimozione(modello, taglia, colore);
                            break;
                        default:
                            System.out.println("Operazione non consentita. Riprova.");
                    }
                    break;
                case 4:
                    myShop.pagamento();
                    break;
                case 5:
                    myShop.spedizione();
                    break;
                case 6:
                    myShop.resiCambi();
                    break;
                case 7:
                    myShop.magazzino();
                    break;
                case 8:
                    System.out.println("Uscita ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Operazione non consentita. Riprova.");
            }
        }
    }
}