package ApuracaoHaveres;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa(410000.00, 12700.00, -70000.00, 77300.00);


        empresa.adicionarSocio(new Socio("Ana Julia", 42.00));
        empresa.adicionarSocio(new Socio("Baltazar Correia", 30.00));
        empresa.adicionarSocio(new Socio("Camila Oliveira", 28.00));
 

        double valorDevidoBaltazar = empresa.calcularValorDevido("Baltazar Correia");

        System.out.println("Valor devido a Baltazar Correia: R$ " + valorDevidoBaltazar);
    }
}
