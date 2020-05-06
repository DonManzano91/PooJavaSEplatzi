import Modelo.Doctor;
import Modelo.Paciente;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Ejemplo implementación metodos static
        //showMenu();

        //Ejemplo de sobrecarga de metodo constructor
        Doctor doctor = new Doctor("Alejandro","Nefrologo");

        doctor.generaCitaDisponible(new Date(), "4pm");
        doctor.generaCitaDisponible(new Date(), "5pm");

        System.out.println("Datos del Modelo.Doctor que imprime con toString mod: " + doctor.toString());
        //Para el foreach dentro de un arrayList, instanciar objeto que se llene, este sera de la clase del arrayList
        //:
        //invocar el metodo con el cual se recorra ese objeto o se podra obtener un get
        for (Doctor.CitaDisponible citasDisponibles:
             doctor.obtenCitaGenerada()) {
            System.out.println("con  toString modificado citas disponibles: " + citasDisponibles.toString());
            System.out.println("Cita generada: " + citasDisponibles.getFecha() + " " + citasDisponibles.getHora());
        }

        Paciente paciente = new Paciente("Alejandro", "a@email.com");
        //paciente.peso = 10; //Esta asignación falla debido a que se le coloco un modificador de acceso al campo asociado
        System.out.println(paciente);

    }
}
