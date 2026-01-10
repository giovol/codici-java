package ES_PARCHEGGIO;

public class Cliente {
    private int tempoParcheggio, idCliente;

    public Cliente(int tempoParcheggio, int idCliente) {
        this.tempoParcheggio = tempoParcheggio;
        this.idCliente = idCliente;
    }

    public int getTempoParcheggio() {
        return tempoParcheggio;
    }

    public int getIdCliente() {
        return idCliente;
    }
}
