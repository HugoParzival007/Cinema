package Model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String matricula;
    private String nome;
    List<Ingresso> listIngresso = new ArrayList<>();

    public Funcionario(String nome, String matricula, List<Ingresso> listIngresso) {
        this.nome = nome;
        this.matricula = matricula;
        this.listIngresso = listIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingresso> getListIngresso() {
        return listIngresso;
    }

    public void setListIngresso(List<Ingresso> listIngresso) {
        this.listIngresso = listIngresso;
    }
}
