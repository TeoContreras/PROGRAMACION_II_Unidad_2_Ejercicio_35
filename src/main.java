import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<EstrategiaEnvio> envios = new ArrayList<EstrategiaEnvio>();
        envios.add(new EnvioEstandar(500)); envios.add(new EnvioExpresoAereo(1000)); envios.add(new EnvioMaritimo(700));
        for (EstrategiaEnvio e : envios) {
            double costo = e.calcularCosto(5, 100);
            if (costo >= 0) System.out.println("Costo del envío: $" + costo);
            else System.out.println("Peso o distancia inválidos.");
        }
    }
}
