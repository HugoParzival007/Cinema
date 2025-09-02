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

    public Pedido(long id, Cliente cliente, Funcionario funcionario, List<Lanche> listLanche, List<Ingresso> listIngresso, double valorTotal, LocalDateTime dataHora) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.listLanche = listLanche;
        this.listIngresso = listIngresso;
        this.valorTotal = valorTotal;
        this.dataHora = dataHora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Lanche> getListLanche() {
        return listLanche;
    }

    public void setListLanche(List<Lanche> listLanche) {
        this.listLanche = listLanche;
    }

    public List<Ingresso> getListIngresso() {
        return listIngresso;
    }

    public void setListIngresso(List<Ingresso> listIngresso) {
        this.listIngresso = listIngresso;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
