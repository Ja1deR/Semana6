package Hospital;

//Clase padre/superclase "Persona".
public class Persona {

    //Variables de la clase "persona", "Private" por Encapsulamiento.
    private final String nombre;
    private final String apellido;

    //Funcion "getNombre", Para obtener la variable "nombre".
    public String getNombre() {
        return nombre;
    }

    //Funcion "getApellido", Para obtener la variable "apellido".
    public String getApellido() {
        return apellido;
    }

    //Constructor sobrecargado.
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
