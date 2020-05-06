package Modelo;

public class Enfermera extends User {

    private String especialidad;

    public Enfermera(String nombre, String email) {
        super(nombre, email);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
