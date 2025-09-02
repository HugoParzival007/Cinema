package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private Cliente cliente;
    private Funcionario funcionario;
    List<Lanche> listLanche = new ArrayList<>();
    List<Ingresso> listIngresso = new ArrayList<>();
    private double valorTotal;
    private LocalDateTime dataHora;

    public Pedido(long id, Cliente cliente, Funcionario funcionario) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
}
