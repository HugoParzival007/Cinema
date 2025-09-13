package Model;

public class Sala {
    private long id;
    private String nome;
    private int capacidade;
    private int poutronas[][];

    public Sala(long id, String nome, int capacidade, int[][] poutronas) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.poutronas = poutronas;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int[][] getPoutronas() {
        return poutronas;
    }

    public void setPoutronas(int[][] poutronas) {
        this.poutronas = poutronas;
    }
}
