package ES_PARCHEGGIO;

public class Parcheggio {
    private int posti, postiOccupati, postiLiberi;
    private boolean aperto;

    public Parcheggio(int posti, boolean aperto) {
        this.posti = posti;
        this.aperto = aperto;
        postiOccupati = 0;
        postiLiberi = this.posti;
    }

    public void apriParcheggio() {
        aperto = true;
        System.out.println("Parcheggio aperto!");
    }

    public boolean isAperto() {
        return aperto;
    }

    public void occupaUnPosto() {
        if (postiLiberi > 0) {
            postiLiberi--;
            postiOccupati++;
        }
    }

    public void liberaUnPosto() {
        if (postiOccupati != 0) {
            postiOccupati--;
            postiLiberi++;
        }
    }

    public void chiudiParcheggio() {
        aperto = false;
        System.out.println("Parcheggio chiuso!");
    }
}
