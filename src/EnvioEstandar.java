public class EnvioEstandar extends EstrategiaEnvio {
    public EnvioEstandar(double tarifa) { super(tarifa); }
    public double calcularCosto(double peso, double distancia) {
        if (peso < 0 || distancia < 0) return -1;
        return tarifaBase + peso * 100 + distancia * 2;
    }
}
