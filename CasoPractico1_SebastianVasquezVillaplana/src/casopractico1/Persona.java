
package casopractico1;

public abstract  class Persona {
   public  String nombre;
   public  int ID;
   public  int Edad;

    public Persona(String nombre, int ID, int Edad) {
        this.nombre = nombre;
        this.ID = ID;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    public abstract void AgregarPersona();
    public abstract void mostrarInformacion();
        
    
    
}
