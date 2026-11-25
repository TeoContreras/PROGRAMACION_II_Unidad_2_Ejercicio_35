public class EnvioMaritimo extends EstrategiaEnvio {
    public EnvioMaritimo(double tarifa) { super(tarifa); }
    public double calcularCosto(double peso, double distancia) {
        if (peso < 0 || distancia < 0) return -1;
        return tarifaBase + peso * 80 + distancia;
    }
}
