public class Doctor {

    static int id;
    String nombre;
    String especialidad;

    Doctor(){
        System.out.println("Constructor del Doctor");
        id++;
    }

    Doctor(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void muestraNombre(){
        System.out.println(nombre);
    }

    public void muestraId() {
        System.out.println("Id del doctor: " + id);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
