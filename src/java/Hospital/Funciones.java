package Hospital;

//clase Funciones.
public class Funciones {

    //Funcion ImprimirHospital, para mostrar los nombres del Hospital.
    public String ImprimirHospital() {

        //Creacion de objetos de la clase "Hospital".
        Hospital h1 = new Hospital("CediMec");
        Hospital h2 = new Hospital("Medifaca");
        Hospital h3 = new Hospital("SantaAna");

        return (h1.Imprimir() + h2.Imprimir() + h3.Imprimir());

    }

    //Funcion ImprimirMedicos, para mostrar los datos de los medicos.
    public String ImprimirMedicos() {

        //Creacion de objetos de la clase "Medico".
        Medico me1 = new Medico("Dr." + "Arturo", "Duarte");
        Medico me2 = new Medico("Dr." + "Fernando", "Alonso");
        Medico me3 = new Medico("Dr." + "Marcos", "Moreno");

        return (me1.Imprimir() + me2.Imprimir() + me3.Imprimir());

    }

    //Funcion ImprimirPacientes, para mostrar los datos de los pacientes.
    public String ImprimirPacientes() {

        //Creacion de objetos de la clase "Paciente".
        Paciente pa1 = new Paciente("Cra33 #20-10a sur", "Consulta general", "Arturo", "Medifaca", "22 de Febrero de 2042", 16549, "Masculino", "Carlos", "Perez");
        Paciente pa2 = new Paciente("Cra7 #3-2b norte", "Dolor muscular", "Fernando", "CediMec", "5 de Agosto de 2043", 19654, "Femenino", "Andrea", "Sarmiento");
        Paciente pa3 = new Paciente("Calle12 #12-2a sur", "Lesion en una pierna", "Marcos", "SantaAna", "8 de Abril de 2042", 23167, "Masculino", "Andres", "Diaz");
        return (pa1.Imprimir() + pa2.Imprimir() + pa3.Imprimir());

    }
}
