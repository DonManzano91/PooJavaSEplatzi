public class Doctor {

    static int id;
    String nombre;
    String especialidad;

    Doctor(){
        System.out.println("Constructor del Doctor");
        id++;
    }

    Doctor(String nombre){
        System.out.println("El nombre del doctor es: " + nombre);
    }

    public void muestraNombre(){
        System.out.println(nombre);
    }

    public void muestraId() {
        System.out.println("Id del doctor: " + id);
    }
}
