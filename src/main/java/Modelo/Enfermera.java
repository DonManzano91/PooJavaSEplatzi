package Modelo;

public class Enfermera extends User {

    private String especialidad;

    public Enfermera(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public void muestraDatosUsuarios() {
        System.out.println("La enfermera esta en el hospial medica Sur");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
