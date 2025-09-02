package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private long id;
    private Filme filme;
    private Sala sala;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    List<Ingresso> listIgressosVendidos = new ArrayList<>();

    public Sessao(long id, Filme filme, Sala sala, LocalDateTime inicio, LocalDateTime fim, List<Ingresso> listIgressosVendidos) {
        this.id = id;
        this.filme = filme;
        this.sala = sala;
        this.inicio = inicio;
        this.fim = fim;
        this.listIgressosVendidos = listIgressosVendidos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public List<Ingresso> getListIgressosVendidos() {
        return listIgressosVendidos;
    }

    public void setListIgressosVendidos(List<Ingresso> listIgressosVendidos) {
        this.listIgressosVendidos = listIgressosVendidos;
    }
}
