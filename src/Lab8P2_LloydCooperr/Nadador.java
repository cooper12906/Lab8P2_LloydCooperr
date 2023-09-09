package Lab8P2_LloydCooperr;

import java.io.Serializable;

public class Nadador implements Serializable {
    private String nombre;
    private String nacionalidad;
    private int edad;
    private double estatura;
    private String estiloNatacion;
    private int distancia;
    private int tiempoMasRapido;
    private int numeroMedallasConseguidas;
    private static final long SerialVersionUID=555L;
    
    public Nadador(String nombre, Pais nacionalidad, int edad, double estatura, String estiloNatacion, int distancia, int tiempoMasRapido, int numeroMedallasConseguidas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad.getNombre();
        this.edad = edad;
        this.estatura = estatura;
        this.estiloNatacion = estiloNatacion;
        this.distancia = distancia;
        this.tiempoMasRapido = tiempoMasRapido;
        this.numeroMedallasConseguidas = numeroMedallasConseguidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
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

    public int getTiempoMasRapido() {
        return tiempoMasRapido;
    }

    public void setTiempoMasRapido(int tiempoMasRapido) {
        this.tiempoMasRapido = tiempoMasRapido;
    }

    public int getNumeroMedallasConseguidas() {
        return numeroMedallasConseguidas;
    }

    public void setNumeroMedallasConseguidas(int numeroMedallasConseguidas) {
        this.numeroMedallasConseguidas = numeroMedallasConseguidas;
    }

    @Override
    public String toString() {
        return nombre + "\n" + distancia;
    }
}
