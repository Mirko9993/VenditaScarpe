class Shoes {
    private String modello;
    private double prezzo;
    private int quantita;
    private int taglia;
    private String colore;

    public Shoes(String modello, double prezzo, int quantita, int taglia, String colore) {
        this.modello = modello;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.taglia = taglia;
        this.colore = colore;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getTaglia() {
        return taglia;
    }

    public String getColore() {
        return colore;
    }

    @Override
    public String toString() {
        return "Modello: " + modello + ", Prezzo: " + prezzo + ", Quantità: " + quantita + ", Taglia: " + taglia + ", Colore: " + colore;
    }
}