package ApuracaoHaveres;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Socio> socios;
    private double capitalSubscrito;
    private double reservasLucro;
    private double prejuizosAcumulados;
    private double lucroAteAgosto;

    public Empresa(double capitalSubscrito, double reservasLucro, double prejuizosAcumulados, double lucroAteAgosto) {
        this.socios = new ArrayList<>();
        this.capitalSubscrito = capitalSubscrito;
        this.reservasLucro = reservasLucro;
        this.prejuizosAcumulados = prejuizosAcumulados;
        this.lucroAteAgosto = lucroAteAgosto;
    }

    public void adicionarSocio(Socio socio) {
        socios.add(socio);
    }

    public double calcularPatrimonioLiquido() {
        return capitalSubscrito + reservasLucro + prejuizosAcumulados + lucroAteAgosto;
    }

    public double calcularValorDevido(String nomeSocio) {
        double patrimonioLiquido = calcularPatrimonioLiquido();
        for (Socio socio : socios) {
            if (socio.getNome().equals(nomeSocio)) {
                return (socio.getParticipacao() / 100) * patrimonioLiquido;
            }
        }
        return 0;
    }
}
