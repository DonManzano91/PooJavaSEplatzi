import static UI.UIMenu.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejemplo implementación metodos static
        //showMenu();

        //Ejemplo de sobrecarga de metodo constructor
        Doctor doctor = new Doctor("Alejandro","Nefrologo");
        System.out.println(doctor.toString());

        Paciente paciente = new Paciente("Alejandro", "a@email.com");
        //paciente.peso = 10; //Esta asignación falla debido a que se le coloco un modificador de acceso al campo asociado

    }
}
