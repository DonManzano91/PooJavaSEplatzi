import java.util.ArrayList;
import java.util.Date;

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

    ArrayList<CitaDisponible> citasDisponibles = new ArrayList<CitaDisponible>();
    public void generaCitaDisponible(Date fecha, String hora){
        citasDisponibles.add(new CitaDisponible(fecha, hora));
    }

    public ArrayList<CitaDisponible>  obtenCitaGenerada(){
        return citasDisponibles;
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
    }
}
