package UI;

import Modelo.Doctor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import static UI.UIMenuDoctor.*;

public class UIMenuPaciente {

    public static void muestraPacienteMenu(){
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Bienvenido " + UIMenu.pacienteLogueado.getNombre());
            System.out.println("1. Cita disponble");
            System.out.println("2. Citas existentes");
            System.out.println("0. logout");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("Aqui estan sus citas disponibles");
                    muestraCitasDisponiblesPaciente();
                    break;
                case 2:
                    System.out.println("Aqui estan sus citas ya agendadas");
                    muestrameMiCita();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (respuesta!=0);
    }

    private static void muestraCitasDisponiblesPaciente(){
        int respuesta = 0;
        do {
            System.out.println("Generemos una cita \n");
            System.out.println("Elige una fecha \n");
            //Numeracion de la lista de fechas,
            //En el Integer va el indice de las citas
            //Segundo Map, indice doctore
            Map<Integer, Map<Integer, Doctor>> doctores = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < citasDisponiblesPorDoctor.size(); i++){
                ArrayList<Doctor.CitaDisponible> citasDisponibles
                    = citasDisponiblesPorDoctor.get(i).obtenCitaGenerada();

                Map<Integer, Doctor> citasDoctores = new TreeMap<>();
                for (int j = 0; j< citasDisponibles.size(); j++){
                    k++;
                    System.out.println(k + " . " + citasDisponibles.get(j).getFecha());
                    citasDoctores.put(Integer.valueOf(j), citasDisponiblesPorDoctor.get(i));
                    doctores.put(Integer.valueOf(k), citasDoctores);
                }
            }
            Scanner sc = new Scanner(System.in);
            int respuestaSeleccionada = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> seleccionDoctorDisponble = doctores.get(respuestaSeleccionada);
            Integer fechaIndice = 0;
            Doctor doctorElegido = new Doctor("", "");
                /*EL set que se llena*/           /*El set que se recorre*/
            for (Map.Entry<Integer, Doctor> doc : seleccionDoctorDisponble.entrySet()) {
                fechaIndice = doc.getKey();
                doctorElegido = doc.getValue();
            }
            System.out.println(doctorElegido.getNombre() + ". Hora: " +
                    doctorElegido.obtenCitaGenerada().get(fechaIndice).getFecha() +
                    ". Hora " +
                    doctorElegido.obtenCitaGenerada().get(fechaIndice).getHora()
                    );
            System.out.println("Confirma tu cita: \n1. Si \n2. Cambiar fecha" );
            respuesta = Integer.valueOf(sc.nextLine());

            if (respuesta == 1){
                UIMenu.pacienteLogueado.setCitasDoctor(
                        doctorElegido,
                        doctorElegido.obtenCitaGenerada().get(fechaIndice).getFecha(null),
                        doctorElegido.obtenCitaGenerada().get(fechaIndice).getHora()
                );

                muestraPacienteMenu();
            }


        }while(respuesta!=0);
    }

    private static void muestrameMiCita(){
        int respuesta = 0;
        do {
            System.out.println("Estas son tus citas medicas");

            if (UIMenu.pacienteLogueado.getCitasDoctor().size() == 0){
                System.out.println("No tienes citas generads");
                break;
            }

            for (int i = 0; i<UIMenu.pacienteLogueado.getCitasDoctor().size(); i++){
                int j = i+0;
                System.out.println("Tus citas son: " +
                        j + ". " +
                        "Fecha: " + UIMenu.pacienteLogueado.getCitasDoctor().get(i).getFecha() +
                        "a la hora: " + UIMenu.pacienteLogueado.getCitasDoctor().get(i).getHora() +
                        "\ncon el Doctor: " + UIMenu.pacienteLogueado.getCitasDoctor().get(i).getDoctor());
            }
        }while(respuesta!=0);
    }
}
