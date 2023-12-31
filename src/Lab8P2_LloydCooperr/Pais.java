package Lab8P2_LloydCooperr;

import java.io.Serializable;
import java.util.ArrayList;

public class Pais implements Serializable {
    private String nombre;
    private ArrayList <Nadador> nadadores = new ArrayList();
    private int numeroMedallas;
    private static final long SerialVersionUID=555L;

    public Pais(String nombre, int numeroMedallas) {
        this.nombre = nombre;
        this.numeroMedallas = numeroMedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getNumeroMedallas() {
        return numeroMedallas;
    }

    public void setNumeroMedallas(int numeroMedallas) {
        this.numeroMedallas = numeroMedallas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
