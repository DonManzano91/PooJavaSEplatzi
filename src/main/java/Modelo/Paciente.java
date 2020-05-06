package Modelo;

import Modelo.User;

public class Paciente extends User {

    String cumple;
    private double peso;
    private double altura;
    String tipoSangre;

    public Paciente(String nombre, String email) {
        super(nombre, email);
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
