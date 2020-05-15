package Modelo;

import Modelo.User;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends User {

    String cumple;
    private double peso;
    private double altura;
    String tipoSangre;

    //Se instancia la lista que contendra las citas del paciente con los doctores
    private ArrayList<CitasDoctor> citasDoctor = new ArrayList<>();
    //Se instancia la lista que contendra las citas del paciente con las enferemeras
    private ArrayList<CitasEnfermera> citasEnfermera = new ArrayList<>();


    public ArrayList<CitasDoctor> getCitasDoctor() {
        return citasDoctor;
    }
    //Metodo que generara la cita del paciente con el doctor
    public void setCitasDoctor(Doctor doctor, Date fecha, String hora) {
        //se instancia el objeto cita doctor, el constructor obtiene el paciente logueado, y el doc elegico
        CitasDoctor citaDoctor = new CitasDoctor(this, doctor);
        //Se le pasan los parametros de fecha y usan el m. abstracto de la iterfaz citación
        citaDoctor.citacion(fecha, hora);
        //Se añade la cita ya creada la lista de citas
        citasDoctor.add(citaDoctor);
    }

    public ArrayList<CitasEnfermera> getCitasEnfermera() {
        return citasEnfermera;
    }

    public void setCitasEnfermera(ArrayList<CitasEnfermera> citasEnfermera) {
        this.citasEnfermera = citasEnfermera;
    }

    public Paciente(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void muestraDatosUsuarios() {
        System.out.println("El paciente esta en solo un hospital a la vez");
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Modelo.Paciente{" +
                "cumple='" + cumple + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
