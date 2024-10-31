package casopractico1;

import javax.swing.JOptionPane;

public class GestionArticulos {
    private String nombreProducto;
    private int Precio;

    public GestionArticulos(String nombreProducto, int Precio) {
        this.nombreProducto = nombreProducto;
        this.Precio = Precio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
     
    public void MostrarProductos(){
        JOptionPane.showMessageDialog(null, "El Producto  es  " + nombreProducto +  "Tiene un precio de :" + Precio + "Colones ");
        
    
    }
    
    
}
