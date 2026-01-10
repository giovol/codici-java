package ES_PARCHEGGIO;

public class Custode {
    private Parcheggio parcheggioDiCompetenza;

    public Custode(Parcheggio parcheggioDiCompetenza) {
        this.parcheggioDiCompetenza = parcheggioDiCompetenza;
    }

    public void apriParcheggioSeNonAperto() {
        if (!parcheggioDiCompetenza.isAperto()) {
            parcheggioDiCompetenza.apriParcheggio();
        }
    }

    public void chiudiParcheggioSeNonChiuso() {
        if (parcheggioDiCompetenza.isAperto()) {
            parcheggioDiCompetenza.chiudiParcheggio();
        }
    }

    public void parcheggiaCliente(Cliente cliente) {
        try {
            System.out.println("Cliente " + cliente.getIdCliente() + " ha parcheggiato per "
                    + (cliente.getTempoParcheggio() / 1000) + " secondi");
            parcheggioDiCompetenza.occupaUnPosto();
            cliente.wait(cliente.getTempoParcheggio()); // Non funziona dando l'errore current thread is not owner.
            System.out.println("Cliente " + cliente.getIdCliente() + " è uscito dal parcheggio.");
            parcheggioDiCompetenza.liberaUnPosto();
        } catch (Exception ex) {
            System.out.println("Errore nell'esecuzione del programma: " + ex.getMessage());
        }
    }
}
