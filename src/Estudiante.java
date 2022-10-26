public class Estudiante extends Persona {

    String GradoE;

    //contructor
    public Estudiante (String entNombre, String entEdad, String entGradoE){
        super(entNombre, entEdad);
        this.GradoE = entGradoE;

    }

    //metodo
    public String Mostrar(){
        return super.Mostrar()+ "\nEl grado es: "+ GradoE;
    }

    /*private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
*/
}
