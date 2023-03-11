package lab7p2_joselobo;

import javax.swing.JProgressBar;

public class DescargarArchivo implements Runnable {

    JProgressBar ProgresBar;
    double Peso;

    public DescargarArchivo(JProgressBar ProgresBar, double Peso) {
        this.ProgresBar = ProgresBar;
        this.Peso = Peso;
    }

    @Override
    public void run() {
        ProgresBar.setMaximum(peso/10);
        while (en.hasMoreElements()) {
            Object nextElement = en.nextElement();
            
        }
        
    }

}
