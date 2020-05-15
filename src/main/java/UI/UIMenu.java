package UI;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIMenuDoctor.*;
import static UI.UIMenuPaciente.muestraPacienteMenu;

public class UIMenu {
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogueado;
    public static Paciente pacienteLogueado;


    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    System.out.println("valor de response "+response);
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
                    break;
            }
        }while (response != 0); //Si da true, da otro ciclo
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int tipoUsuario){
        //tipoUsuario = 1 Doctor, 2 paciente
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Manzano", "a@email.com"));
        doctors.add(new Doctor("Ricardo Manzano", "r@email.com"));
        doctors.add(new Doctor("Itzel", "i@email.com"));

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("k manzano", "k@email.com"));
        pacientes.add(new Paciente("Nina Colmillos", "n@email.com"));
        pacientes.add(new Paciente("lola mento", "l@email.com"));

        boolean emailCorrecto = false;
        do{
            System.out.println("agrega tu dirección de correo");
            Scanner sn = new Scanner(System.in);
            String email = sn.nextLine();
            System.out.println("tipoUsuario: " + tipoUsuario);
            if (tipoUsuario == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)) {
                        emailCorrecto = true; /*Se encontro el doctor en los reg, se loguea*/
                        doctorLogueado = d;/*Esto cuenta como login correcto para el doc*/
                        UIMenuDoctor.muestraMenuDoctor();
                    }
                }
            }else if (tipoUsuario == 2){
                for (Paciente p: pacientes){
                    if (p.getEmail().equals(email)) {
                        emailCorrecto = true; /*Se encontro el doctor en los reg, se loguea*/
                        pacienteLogueado = p;/*Esto cuenta como login correcto para el paciente*/
                        muestraPacienteMenu();
                    }
                }
            }

        }while (!emailCorrecto);
    }
}
