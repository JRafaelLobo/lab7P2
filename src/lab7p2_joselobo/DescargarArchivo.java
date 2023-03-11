package lab7p2_joselobo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class DescargarArchivo extends Thread {

    JProgressBar ProgresBar;
    double Peso;

    public DescargarArchivo(JProgressBar ProgresBar, double Peso) {
        this.ProgresBar = ProgresBar;
        this.Peso = Peso;
    }

    @Override
    public void run() {
        ProgresBar.setMaximum((int) (Peso / 10));
        while (ProgresBar.getMaximum() != ((int) (Peso / 10))) {
            ProgresBar.setValue(ProgresBar.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }

}
