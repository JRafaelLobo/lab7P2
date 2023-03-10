package lab7p2_joselobo;

import java.io.Serializable;
import javax.swing.JList;
import javax.swing.JTree;

public class Total implements Serializable {

    private JTree MiUnidad = new JTree();
    private JTree Destacados = new JTree();
    private JTree Papeleria = new JTree();
    private JList Descarga = new JList();

    public Total() {
        javax.swing.tree.DefaultMutableTreeNode a = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        MiUnidad.setModel(new javax.swing.tree.DefaultTreeModel(a));
        javax.swing.tree.DefaultMutableTreeNode b = new javax.swing.tree.DefaultMutableTreeNode("Destacados");
        Destacados.setModel(new javax.swing.tree.DefaultTreeModel(b));
        javax.swing.tree.DefaultMutableTreeNode c = new javax.swing.tree.DefaultMutableTreeNode("Papeleria");
        Papeleria.setModel(new javax.swing.tree.DefaultTreeModel(c));
    }

    public Total(String ruta) {

    }

    public JTree getMiUnidad() {
        return MiUnidad;
    }

    public void setMiUnidad(JTree MiUnidad) {
        this.MiUnidad = MiUnidad;
    }

    public JTree getDestacados() {
        return Destacados;
    }

    public void setDestacados(JTree Destacados) {
        this.Destacados = Destacados;
    }

    public JTree getPapeleria() {
        return Papeleria;
    }

    public void setPapeleria(JTree Papeleria) {
        this.Papeleria = Papeleria;
    }

    public JList getDescarga() {
        return Descarga;
    }

    public void setDescarga(JList Descarga) {
        this.Descarga = Descarga;
    }

}
