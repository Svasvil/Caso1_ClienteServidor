package casopractico1;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CasoPractico1 {

    public static void main(String[] args) {
   int opc;
        do {
            JOptionPane.showMessageDialog(null, "Bienvenido al supermercado Colon");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite que desea realizar \n"
                    + "1. Consultar Productos disponibles  "
                    + "\n2. Consultar clientes que llegaron   "
                    + "\n3. Consultar Trabajadores."
                    + "\n4. Agregar clientes recientes"
                    + "\n5. Hacer txt"
                    + "\n6. Salir"));

            switch (opc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Estos son los productos disponibles:");
                    GestionArticulos g1 = new GestionArticulos("Arroz", 1000);
                    GestionArticulos g2 = new GestionArticulos("Papa", 1350);
                    GestionArticulos g3 = new GestionArticulos("Frijoles", 900);
                    GestionArticulos g4 = new GestionArticulos("Agua", 750);
                    g1.MostrarProductos();
                    g2.MostrarProductos();
                    g3.MostrarProductos();
                    g4.MostrarProductos();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Estos son los clientes que llegaron:");
                    Persona Cliente1 = new Cliente("Ariel", 100001, 32);
                    Persona Cliente2 = new Cliente("Lorena", 200002, 55);
                    Persona Cliente3 = new Cliente("Ricardo", 3000003, 58);
                    Persona Cliente4 = new Cliente("Valeria", 400004, 27);
                    Cliente1.mostrarInformacion();
                    Cliente2.mostrarInformacion();
                    Cliente3.mostrarInformacion();
                    Cliente4.mostrarInformacion();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Estos son los trabajadores:");
                    Persona Vendedor1 = new Vendedor("Sebastián", 1001, 27, 250000, "Cajero");
                    Persona Vendedor2 = new Vendedor("Joaquín", 2002, 17, 310000, "Acomodador");
                    Persona Vendedor3 = new Vendedor("Saul", 3003, 34, 250000, "Cajero");
                    Vendedor1.mostrarInformacion();
                    Vendedor2.mostrarInformacion();
                    Vendedor3.mostrarInformacion();
                    break;
                case 4:
                    Persona NuevoCliente = new Cliente("x", 0, 0);
                    NuevoCliente.AgregarPersona();
                    break;
                case 5:
                    txt texto1 = new txt();
                    texto1.crearArchivo();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break; 
                default:    
            }
        } while (opc != 6); 
    }
}