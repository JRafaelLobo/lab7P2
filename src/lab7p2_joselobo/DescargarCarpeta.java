package lab7p2_joselobo;

import javax.swing.JProgressBar;
import javax.swing.tree.DefaultMutableTreeNode;

public class DescargarCarpeta extends Thread {

    JProgressBar ProgresBar;
    JProgressBar ProgresBar2;
    DefaultMutableTreeNode Nodo;

    public DescargarCarpeta(JProgressBar ProgresBar, JProgressBar ProgresBar2, DefaultMutableTreeNode Nodo) {
        this.ProgresBar = ProgresBar;
        this.ProgresBar2 = ProgresBar2;
        this.Nodo = Nodo;
    }

    @Override
    public void run() {
        ProgresBar.setMaximum(Nodo.getChildCount());
        for (int i = 0; i < Nodo.getChildCount(); i++) {
            if (Nodo.getChildAt(0) instanceof Archivo) {
                DefaultMutableTreeNode Nodo2 = (DefaultMutableTreeNode) Nodo.getChildAt(0);
                Archivo A = (Archivo) Nodo2.getUserObject();
                DescargarArchivo Des = new DescargarArchivo(ProgresBar2, A.getTamano());
                Des.run();
                ProgresBar.setValue(ProgresBar.getValue() + 1);
            }
            if (Nodo.getChildAt(0) instanceof Carpeta) {
                javax.swing.JProgressBar random;
                random = new javax.swing.JProgressBar();
                DefaultMutableTreeNode Nodo2 = (DefaultMutableTreeNode) Nodo.getChildAt(0);
                DescargarCarpeta a = new DescargarCarpeta(ProgresBar2, random, Nodo2);
                a.run();
                ProgresBar.setValue(ProgresBar.getValue() + 1);
            }
        }
    }

}
