/*
Scrivere la classe Piscina per il calcolo di superficie e volume di una Piscina. Sono date le tre
dimensioni: larghezza, profondità e altezza.
Realizzare:
• variabili di esemplare;
• costruttori vuoto e completo;
• metodo ?volume(?) per il calcolo del volume della piscina;
• metodo ?superficie(?) per il calcolo della superficie della piscina (Mq);
• metodi getter e setter;
• metodo String toString() che ritorna lo stato dell’oggetto;
• il metodo ?costoRiempimento(?) che riceve come input dal tester il costo di un litro di acqua
e ritorna il costo per riempire tutta la piscina (conversione litro-Mc);
*/
public class Piscina {
    private double larghezza, lunghezza, profondita;
    private int id;

    /**
     * Costruttore che inizializza una nuova piscina con le dimensioni 100x100x20
     */
    public Piscina() {
        larghezza = 100;
        lunghezza = 100;
        profondita = 20;
        id = 0;
    }

    /**
     * Costruttore che inizializza una nuova piscina date le dimensioni.
     */
    public Piscina(double larghezza, double lunghezza, double profondita, int id) {
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.profondita = profondita;
        this.id = id;
    }

    /**
     * Calcola e restituisce il volume della piscina.
     */
    public double calcolaVolume() {
        return calcolaSuperficie() * profondita;
    }

    /**
     * Calcola e restituisce la superficie della piscina.
     */
    public double calcolaSuperficie() {
        return larghezza * lunghezza;
    }

    /**
     * Restituisce l'identificativo della piscina.
     */
    public int getId() {
        return id;
    }

    /**
     * Restituisce la larghezza della piscina.
     */
    public double getLarghezza() {
        return larghezza;
    }

    /**
     * Restituisce la lunghezza della piscina.
     * 
     * @return
     */
    public double getLunghezza() {
        return lunghezza;
    }

    /**
     * Restituisce la profondità della piscina.
     */
    public double getProfondita() {
        return profondita;
    }

    /**
     * Imposta la larghezza della piscina dato il valore.
     */
    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    /**
     * Imposta la lunghezza della piscina dato il valore.
     */
    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    /**
     * Imposta la profondità della piscina dato il valore.
     */
    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

    /**
     * Restituisce le informazioni sull'oggetto in una stringa.
     */
    @Override
    public String toString() {
        return "Piscina n." + getId() +
                "\nLunghezza: " + getLunghezza() + "m" +
                "\nLarghezza: " + getLarghezza() + "m" +
                "\nProfondità: " + getProfondita() + "m" +
                "\nSuperficie: " + calcolaSuperficie() + "m2" +
                "\nVolume: " + calcolaVolume() + "m3";
    }

    /**
     * Calcola il costro del riempimento della piscina dato il prezzo per 1 litro di acqua.
     */
    public double calcolaCostoRiempimento(double prezzoAcqua) {
        return (calcolaVolume() * 1000) * prezzoAcqua;
    }

}
