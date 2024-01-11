import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private int capacidade;
    private int horarioFuncionamento;
    private String endereco;
    private List<Vaga> vagas;

    public Estacionamento(int capacidade, int horarioFuncionamento, String endereco) {
        this.capacidade = capacidade;
        this.horarioFuncionamento = horarioFuncionamento;
        this.endereco = endereco;
        this.vagas = new ArrayList<>();
        inicializarVagas();
    }

// getters e setters
    public int getVagasRestantes() {
        return vagasDisponiveis();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

// Inicializa as vagas do estacionamento com status "Disponível"
private void inicializarVagas() {
    for (int i = 1; i <= capacidade; i++) {
        vagas.add(new Vaga(i, "Disponível"));
    }
}

// Retorna a quantidade de vagas disponíveis
public int vagasDisponiveis() {
    int count = 0;
    for (Vaga vaga : vagas) {
        if (vaga.getStatus().equals("Disponível")) {
            count++;
        }
    }
    return count;
}

// Estaciona um carro em uma vaga específica, se disponível
public boolean estacionarCarro(int numeroVaga) {
    if (numeroVaga >= 1 && numeroVaga <= vagas.size()) {
        Vaga vaga = vagas.get(numeroVaga - 1);
        if (vaga.getStatus().equals("Disponível")) {
            vaga.ocuparVaga();
            return true;
        }
    }
    return false;
}

// Libera uma vaga ocupada
public boolean liberarVaga(int numeroVaga) {
    if (numeroVaga >= 1 && numeroVaga <= vagas.size()) {
        Vaga vaga = vagas.get(numeroVaga - 1);
        if (vaga.getStatus().equals("Ocupada")) {
            vaga.liberarVaga();
            return true;
        }
    }
    return false;
}

// Adiciona um cliente ao estacionamento, ocupando uma vaga disponível
public boolean adicionarCliente(Cliente cliente) {
    if (cliente != null && !vagas.isEmpty() && vagasDisponiveis() > 0) {
        for (Vaga vaga : vagas) {
            if (vaga.getStatus().equals("Disponível")) {
                vaga.setCarroEstacionado(cliente.getCarro());
                vaga.setStatus("Ocupada");
                capacidade--;
                return true;
            }
        }
    }
    return false;
}

// Remove um cliente quando uma vaga é liberada
public void removerClienteQuandoLiberarVaga(int numeroVaga) {
    if (numeroVaga >= 1 && numeroVaga <= vagas.size()) {
        Vaga vaga = vagas.get(numeroVaga - 1);
        if (vaga.getStatus().equals("Ocupada")) {
            Cliente clienteRemovido = vaga.liberarVaga();
            if (clienteRemovido != null) {
                capacidade++;
                System.out.println("Cliente removido: " + clienteRemovido.getNome());
            } else {
                System.out.println("Erro ao remover cliente. Vaga não contém cliente.");
            }
        } else {
            System.out.println("A vaga " + numeroVaga + " já está disponível.");
        }
    } else {
        System.out.println("Número de vaga inválido.");
    }
}

}
