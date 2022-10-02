package Hospital;

//clase "hospital".
public class Hospital {

    // se crea la variable global para Hospitales.
    private final String nombreH;

    //Funcion "getNombreHospital", Para obtener la variable "nombreH".
    public String getNombreHospital() {
        return nombreH;
    }

    //Constructor sobrecargado.
    public Hospital(String nombreH) {
        this.nombreH = nombreH;
    }

    //Funcion Imprimir, para mostrar El nombre del Hospital.
    public String Imprimir() {
       
        String s;
        s = ("\nNombre Hospital: " + getNombreHospital());
        return s;
    }

}
