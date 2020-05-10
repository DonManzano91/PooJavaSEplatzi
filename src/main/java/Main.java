import Modelo.Doctor;
import Modelo.Paciente;
import Modelo.User;

import java.util.Date;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        //Ejemplo implementación metodos static
        showMenu();

        //Ejemplo de sobrecarga de metodo constructor
        /*Doctor doctor = new Doctor("Alejandro","Nefrologo");

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

        User usuario = new User("Ale", "a@e.com"){
            //Asi instanciamos una clase abstracta, usando el metodo abstracto que esta definido ahi
            @Override
            public void muestraDatosUsuarios() {
                System.out.println("Comportamiento creado clase anonima");
                System.out.println("Doctor Alejandro");
            }
        };

        usuario.muestraDatosUsuarios();*/

    }
}
