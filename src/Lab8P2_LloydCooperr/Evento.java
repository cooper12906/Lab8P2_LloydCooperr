package Lab8P2_LloydCooperr;

public class Evento {
    private String estiloNatacion;
    private int distancia;
    private int recordActual;

    public Evento(String estiloNatacion, int distancia, int recordActual) {
        this.estiloNatacion = estiloNatacion;
        this.distancia = distancia;
        this.recordActual = recordActual;
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getRecordActual() {
        return recordActual;
    }

    public void setRecordActual(int recordActual) {
        this.recordActual = recordActual;
    }

    @Override
    public String toString() {
        return estiloNatacion +  distancia + recordActual;
    }
}
