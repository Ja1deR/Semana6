package Hospital;

//clase "Medico", con "final" ya que es la ultima clase, ninguna mas heredará de "Medico".
public final class Medico extends Persona {

    //Constructor sobrecargado.
    public Medico(String nombre, String apellido) {
        super(nombre, apellido);

    }

    //Funcion Imprimir", para mostrar Datos del medico.
    public String Imprimir() {
        String s;

        s = ("\nMedico: " + getNombre() + "\t" + getApellido());
        return s;

    }

}
