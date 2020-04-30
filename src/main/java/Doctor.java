import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    String especialidad;

    Doctor(String nombre, String email){
        super(nombre, email);
        System.out.println("Especialidad del doctor: " + especialidad);
    }

    public void muestraNombre(){
        System.out.println(nombre);
    }

    public void muestraId() {
        System.out.println("Id del doctor: " + id);
    }


    ArrayList<CitaDisponible> citasDisponibles = new ArrayList<CitaDisponible>();
    public void generaCitaDisponible(Date fecha, String hora){
        citasDisponibles.add(new CitaDisponible(fecha, hora));
    }

    public ArrayList<CitaDisponible>  obtenCitaGenerada(){
        return citasDisponibles;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public static class CitaDisponible{
        private int id;
        private Date fecha;
        private String hora;

        public CitaDisponible(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        @Override //Este es al implementarse dentro de la subclase
        public String toString() {
            return "CitaDisponible{" +
                    "fecha=" + fecha +
                    ", hora='" + hora + '\'' +
                    '}';
        }
    }

    @Override //Este toString sobreescrito es para la primera parte del curso
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }


}
