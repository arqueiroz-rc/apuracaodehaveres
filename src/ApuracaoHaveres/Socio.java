package ApuracaoHaveres;

public class Socio {
    private String nome;
    private double participacao;

    public Socio(String nome, double participacao) {
        this.nome = nome;
        this.participacao = participacao;
    }

    public String getNome() {
        return nome;
    }

    public double getParticipacao() {
        return participacao;
    }
}
