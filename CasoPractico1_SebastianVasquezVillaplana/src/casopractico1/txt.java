
package casopractico1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class txt {
     public  void crearArchivo() {
        String NombreArchivo = "TextoCasoPractico.txt";

        try (BufferedWriter txt = new BufferedWriter(new FileWriter(NombreArchivo))) {
            txt.write("Productos disponibles:\n");
            txt.write("1. Arroz - 1000 colones\n");
            txt.write("2. Papa - 1350 colones\n");
            txt.write("3. Frijoles - 900 colones\n");
            txt.write("4. Agua - 750 colones\n");
            txt.write("\nClientes que llegaron:\n");
            txt.write("1. Ariel - ID: 100001 - Edad: 32\n");
            txt.write("2. Lorena - ID: 200002 - Edad: 55\n");
            txt.write("3. Ricardo - ID: 3000003 - Edad: 58\n");
            txt.write("4. Valeria - ID: 400004 - Edad: 27\n");
            txt.write("\nTrabajadores:\n");
            txt.write("1. Sebastián - ID: 1001 - Edad: 27 - Sueldo: 250000 - Rol: Cajero\n");
            txt.write("2. Joaquín - ID: 2002 - Edad: 17 - Sueldo: 310000 - Rol: Acomodador\n");
            txt.write("3. Saul - ID: 3003 - Edad: 34 - Sueldo: 250000 - Rol: Cajero\n");

            JOptionPane.showMessageDialog(null, "Archivo creado: " + NombreArchivo);
                    } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage());
        }
    }
}
