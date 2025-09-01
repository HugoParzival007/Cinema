package Model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    List<Sala> listSala = new ArrayList<>();
    List<Filme> listFilme = new ArrayList<>();
    List<Sessao> listSessao = new ArrayList<>();

    public Cinema(String nome, List<Sala> listSala, List<Filme> listFilme, List<Sessao> listSessao) {
        this.nome = nome;
        this.listSala = listSala;
        this.listFilme = listFilme;
        this.listSessao = listSessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sala> getListSala() {
        return listSala;
    }

    public void setListSala(List<Sala> listSala) {
        this.listSala = listSala;
    }

    public List<Filme> getListFilme() {
        return listFilme;
    }

    public void setListFilme(List<Filme> listFilme) {
        this.listFilme = listFilme;
    }

    public List<Sessao> getListSessao() {
        return listSessao;
    }

    public void setListSessao(List<Sessao> listSessao) {
        this.listSessao = listSessao;
    }
}
