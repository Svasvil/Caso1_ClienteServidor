package casopractico1;

import javax.swing.JOptionPane;



public class Vendedor  extends Persona {
    
   private double salario;
    private String cargo;

    public Vendedor(String nombre, int ID, int Edad, double salario , String cargo) {
        super(nombre, ID, Edad);
        this.cargo = cargo;
        this.salario= salario;
  }
    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void mostrarInformacion() {
        
         JOptionPane.showMessageDialog(null, "El nombre del vendedor es:  " + nombre + " su ID es : " + ID + ", tiene un salario de  " + salario + " Su trabajo es :  " + cargo);
    }
    
    @Override
    public void AgregarPersona() {
       
    }
}
