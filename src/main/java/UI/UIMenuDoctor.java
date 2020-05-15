package UI;

import Modelo.Doctor;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenuDoctor {

    //Esta varianles estatica nos dara la funcionalidad de persistencia
    public static ArrayList<Doctor> citasDisponiblesPorDoctor = new ArrayList<>();

    public static void muestraMenuDoctor(){
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido Doctor " + UIMenu.doctorLogueado.getNombre());
            System.out.println("1. Cita disponble");
            System.out.println("2. Citas existentes");
            System.out.println("0. logout");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("Aqui estan sus citas disponibles");
                    muestraMenuCitasDisponibles();
                    break;
                case 2:
                    System.out.println("Aqui estan sus citas ya agendadas");
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (respuesta != 0);

    }

    public static void  muestraMenuCitasDisponibles(){
        int respuesta = 0;
        do {
            System.out.println("\n");
            System.out.println("Agrega una cita valida");
            System.out.println("Elige el mes: ");
            for (int i = 0; i <= 3; i++){
                int j = i +1;
                System.out.println(j + " . "+ UIMenu.MONTHS[i]);
            }
            System.out.println("0. Regresar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            if (respuesta > 0 && respuesta < 4){
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado + " . " +
                        UIMenu.MONTHS[mesSeleccionado -1]);
                System.out.println("Inserta la fecha disponible [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Tu fecha es: " + date
                    +"\n1. Correcto \n2. Cambiar fecha");
                int fechaRespuesta = Integer.valueOf(sc.nextLine());
                if (fechaRespuesta == 2 ) continue; /*Continue deja que se salte lo sig, reinicia el ciclo desde este
                                                    punto*/
                int horaRespuesta = 0;
                String hora = "";
                do{
                    System.out.println("Inserta la hora deseada para el día: " + date
                    + " [16:00]");
                    hora = sc.nextLine();
                    System.out.println("Tu hora es: " + hora
                            +"\n1. Correcto \n2. Cambiar fecha");
                    horaRespuesta = Integer.valueOf(sc.nextLine());
                }while (horaRespuesta == 2);

                UIMenu.doctorLogueado.generaCitaDisponible(date, hora);


            }else if (respuesta == 0){
                muestraMenuDoctor();
            }
        }while(respuesta!=0);
    }

    public static void revisaCitasDispoiniblesPorDoctor(Doctor doctor){
        if (doctor.obtenCitaGenerada().size() > 0 && !citasDisponiblesPorDoctor.contains(doctor)){
            citasDisponiblesPorDoctor.add(doctor);
        }
    }


}
