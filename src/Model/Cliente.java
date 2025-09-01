package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private String nome;
    List<Ingresso> listingresso = new ArrayList<>();

    public Cliente(long id, String nome, List<Ingresso> listingresso) {
        this.id = id;
        this.nome = nome;
        this.listingresso = listingresso;
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

    public List<Ingresso> getListingresso() {
        return listingresso;
    }

    public void setListingresso(List<Ingresso> listingresso) {
        this.listingresso = listingresso;
    }
}
