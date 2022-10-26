public class Persona {
    String Nombre;
    String Edad;

    //constructor
    public Persona(String entNombre, String entEdad){
        this.Nombre = entNombre;
        this.Edad = entEdad;
    }
    //metodo de tipo string mostrar
    public String Mostrar(){
        return "El nombre es: " + Nombre + "\nLa edad es: " + Edad;
    }
}
