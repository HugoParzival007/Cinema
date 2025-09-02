package Model;

import java.time.LocalDateTime;

public class Ingresso {
    private long id;
    private String codigo;
    private TipoIngresso tipo;
    private Sessao sessao;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDateTime horarioVenda;

    public Ingresso(long id, String codigo, TipoIngresso tipo, Sessao sessao, Cliente cliente, Funcionario funcionario, LocalDateTime horarioVenda) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.sessao = sessao;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.horarioVenda = horarioVenda;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
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

    public LocalDateTime getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(LocalDateTime horarioVenda) {
        this.horarioVenda = horarioVenda;
    }
}
