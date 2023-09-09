package Lab8P2_LloydCooperr;

import javax.swing.JProgressBar;
import javax.swing.JOptionPane;

public class Hilo implements Runnable {
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private String evento;
    private static boolean eventoTerminado = false;

    public Hilo(JProgressBar barra, String evento) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.evento = evento;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (avanzar) {
            if (!eventoTerminado) {
                int avance = (int) (Math.random() * 10); // Avance aleatorio
                int newValue = barra.getValue() + avance;
                if (newValue >= barra.getMaximum()) {
                    newValue = barra.getMaximum();
                    avanzar = false;
                    eventoTerminado = true;
                    //evento.agregarGanador(Thread.currentThread().getName());
                    JOptionPane.showMessageDialog(null, "Nadador " + Thread.currentThread().getName() + " ha ganado el evento " + evento);
                }
                barra.setValue(newValue);
            }
        }
        vive = false;
    }
}
