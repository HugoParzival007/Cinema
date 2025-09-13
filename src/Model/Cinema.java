package Model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private long id;
    private String nome;
    private String endereco;
    List<Sala> listSala = new ArrayList<>();
    List<Filme> listFilme = new ArrayList<>();
    List<Sessao> listSessao = new ArrayList<>();

    public Cinema(long id, String nome, String endereco, List<Sala> listSala, List<Filme> listFilme, List<Sessao> listSessao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.listSala = listSala;
        this.listFilme = listFilme;
        this.listSessao = listSessao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
