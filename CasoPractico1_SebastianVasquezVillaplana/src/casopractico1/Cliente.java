package casopractico1;

import javax.swing.JOptionPane;

public class Cliente extends Persona  {
    public String nombreCliente;

    public Cliente(String nombre, int ID, int Edad) {
        super(nombre, ID, Edad);
        this.nombreCliente = nombreCliente;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    @Override
    public void AgregarPersona() {
        String nombrePersonaNueva = JOptionPane.showInputDialog("Cual es el nombre del nuevo cliente ");
        String IDNuevo  = JOptionPane.showInputDialog("Cual es el ID  del nuevo cliente ");
        String EdadPersonaNueva  = JOptionPane.showInputDialog("Cual es la edad  del nuevo cliente ");
            JOptionPane.showMessageDialog(null , "Datos del nuevo cliente \n "+ "Nombre :" +nombrePersonaNueva +" \n ID : " +IDNuevo+ "\n"+" Edad : "+ EdadPersonaNueva);
        
        
    }
    @Override
    public void mostrarInformacion() {
         JOptionPane.showMessageDialog(null , "El nombre del cliente es  : "+nombre + "Tiene  "+ Edad +"  anios");
       
    }
    
}
