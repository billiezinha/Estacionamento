public class Cliente {
    private String nome;
    private String cpf;
    private Carro carro;

    public Cliente(String nome, String cpf, Carro carro) {
        this.nome = nome;
        this.cpf = cpf;
        this.carro = carro;
    }

// getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    // Método para exibir informações do cliente e carro
    public void exibirInformacoes() {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Carro: " + carro.getModelo() + " | Placa: " + carro.getPlaca());
    }

    // Método para atualizar as informações do cliente
    public void atualizarInformacoes(String novoNome, Carro novoCarro) {
        setNome(novoNome);
        setCarro(novoCarro);
        System.out.println("Informações do cliente atualizadas com sucesso.");
    }
}
