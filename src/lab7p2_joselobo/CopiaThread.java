package lab7p2_joselobo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CopiaThread extends Thread {

    Total t;

    public CopiaThread(Total t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CopiaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            try {
                File fichero = new File("./Datos.dt");
                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                bw.writeObject(t);
                bw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }

        }
    }

}
