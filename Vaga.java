public class Vaga {
    private String status;
    private int numero;

    public Vaga(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

//getters e setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCarroEstacionado(Carro carro) {
    }

    public Object getCarroEstacionado() {
        return null;
    }

// Ocupa a vaga, marcando-a como "Ocupada"
    public void ocuparVaga() {
        if (status.equalsIgnoreCase("Disponível")) {
            status = "Ocupada";
            System.out.println("Vaga " + numero + " ocupada.");
        } else {
            System.out.println("A vaga " + numero + " não está disponível para ocupação.");
        }
    }

// Libera a vaga, marcando-a como "Disponível" e retornando o cliente que estava estacionado
    public Cliente liberarVaga() {
        if (status.equalsIgnoreCase("Ocupada")) {
            status = "Disponível";
            System.out.println("Vaga " + numero + " liberada.");
        } else {
            System.out.println("A vaga " + numero + " já está disponível.");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Vaga [numero=" + numero + ", status=" + status + "]";
    }
}
