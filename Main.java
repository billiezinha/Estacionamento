public class Main {
    public static void main(String[] args) {
        // Criando um estacionamento com capacidade de 10 vagas
        Estacionamento estacionamento = new Estacionamento(10, 24, "Rua Principal");

        // Criando carros
        Carro carro1 = new Carro("Modelo1", "Cor1", "ABC123");
        Carro carro2 = new Carro("Modelo2", "Cor2", "XYZ789");
        Carro carro3 = new Carro("Modelo2", "Cor2", "XYZ789");

        // Criando clientes com carros
        Cliente cliente1 = new Cliente("Kedinhinha", "123456789", carro1);
        Cliente cliente2 = new Cliente("Emilly", "987654321", carro2);
        Cliente cliente3 = new Cliente("leticia", "40028922", carro3);

        // Adicionando clientes ao estacionamento
        estacionamento.adicionarCliente(cliente1);
        estacionamento.adicionarCliente(cliente2);
        estacionamento.adicionarCliente(cliente3);

        // Exibindo informações do estacionamento
        System.out.println("Informações do Estacionamento:");
        System.out.println("Capacidade: " + estacionamento.getCapacidade());
        System.out.println("Horário de Funcionamento: " + estacionamento.getHorarioFuncionamento() + " horas");
        System.out.println("Endereço: " + estacionamento.getEndereco());
        System.out.println("Vagas Disponíveis: " + estacionamento.vagasDisponiveis());

        // Estacionando carros em vagas específicas
        estacionamento.estacionarCarro(1);
        estacionamento.estacionarCarro(2);

        // Liberando vagas ocupadas
        estacionamento.liberarVaga(1);
        estacionamento.liberarVaga(2);
        estacionamento.liberarVaga(3);

        // Exibindo informações dos clientes
        System.out.println("\nInformações dos Clientes:");
        cliente1.exibirInformacoes();
        cliente2.exibirInformacoes();
        cliente3.exibirInformacoes();

        // Removendo cliente do estacionamento
        estacionamento.removerClienteQuandoLiberarVaga(1);


        System.out.println("vagas restantes " + estacionamento.vagasDisponiveis());
    }
}
