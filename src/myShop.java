import java.util.ArrayList;

class MyShop {
    private ArrayList<Shoes> inventario;

    public MyShop() {
        inventario = new ArrayList<>();
    }

    public void caricaScarpa(Shoes shoes) {
        inventario.add(shoes);
    }

    public void visualizzazioneProdotti() {
        for (Shoes shoes : inventario) {
            System.out.println(shoes);
        }
    }

    public void acquista(String modello, int taglia, String colore) {
        for (Shoes shoes  : inventario) {
            if (shoes.getModello().equalsIgnoreCase(modello) && shoes.getTaglia() == taglia && shoes.getColore().equalsIgnoreCase(colore) && shoes.getQuantita() > 0) {
                shoes.setQuantita(shoes.getQuantita() - 1);
                System.out.println("Modello: "+ shoes.getModello() + " venduto: ");
                return;
            }
        }
        System.out.println("Scarpa non disponibile o esaurita ");
    }

    public void pagamento() {
        System.out.println("");
        // TODO gestione pagamento
    }

    public void spedizione() {
        System.out.println("Seleziona l'opzione di spedizione:");
        System.out.println("1. Spedizione a domicilio");
        System.out.println("2. Ritiro in negozio");
        // TODO gestione ritiro
    }

    public void resiCambi() {
        System.out.println();
        // TODO gestione di resi e cambi
    }

    public void magazzino() {
        for (Shoes shoes : inventario) {
            if (shoes.getQuantita() < 5) {
                System.out.println("Scorte basse per il modello: " + shoes.getModello());
            }
        }
    }

    public void modifica(String modello, int taglia, String colore, double nuovoPrezzo, int nuovaQuantita) {
        for (Shoes shoes : inventario) {
            if (shoes.getModello().equalsIgnoreCase(modello) && shoes.getTaglia() == taglia && shoes.getColore().equalsIgnoreCase(colore)) {
                shoes.setQuantita(nuovaQuantita);
                shoes.setPrezzo(nuovoPrezzo);
                System.out.println("Modifiche apportate al modello: " + shoes.getModello());
                return;
            }
        }
        System.out.println("Modello non trovato.");
    }

    public void rimozione(String modello, int taglia, String colore) {
        Shoes scarpaDaRimuovere = null;
        for (Shoes shoes : inventario) {
            if (shoes.getModello().equalsIgnoreCase(modello) && shoes.getTaglia() == taglia && shoes.getColore().equalsIgnoreCase(colore)) {
                scarpaDaRimuovere = shoes;
                break;
            }
        }
        if (scarpaDaRimuovere != null) {
            inventario.remove(scarpaDaRimuovere);
            System.out.println("Scarpa rimossa: " + modello);
        } else {
            System.out.println("Scarpa non trovata.");
        }
    }
}