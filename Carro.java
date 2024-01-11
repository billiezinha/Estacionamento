public class Carro {
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String modelo, String cor, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

// getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
    }
}
