public class EnvioExpresoAereo extends EstrategiaEnvio {
    public EnvioExpresoAereo(double tarifa) { super(tarifa); }
    public double calcularCosto(double peso, double distancia) {
        if (peso < 0 || distancia < 0) return -1;
        return tarifaBase + peso * 250 + distancia * 5;
    }
}
