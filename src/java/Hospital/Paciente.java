package Hospital;

//clase "Paciente", con "final" ya que es la ultima clase, ninguna mas heredará de "Paciente".
public final class Paciente extends Persona {

    private final String direccion;
    private final String motivoConsulta;
    private final String medico;
    private final String hospital;
    private final String fecha;
    private final int codigo;
    private final String sexo;

    //Constructor.
    public Paciente(String direccion, String motivoConsulta, String medico, String hospital, String fecha, int codigo, String sexo, String nombre, String apellido) {
        super(nombre, apellido);
        this.direccion = direccion;
        this.motivoConsulta = motivoConsulta;
        this.medico = medico;
        this.hospital = hospital;
        this.fecha = fecha;
        this.codigo = codigo;
        this.sexo = sexo;
    }

    //Funcion "Imprimir", para mostrar Datos del paciente.
    public String Imprimir() {
        String s;
        s = ("\nCodigo:" + codigo + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nSexo: " + sexo + "\nDireccion: " + direccion + "\nMotivo de la consulta: " + motivoConsulta + "\nHospital: " + hospital + "\nMedico: " + medico + "\nFecha: " + fecha);
        return s;

    }
}
