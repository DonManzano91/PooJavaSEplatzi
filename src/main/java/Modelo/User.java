package Modelo;

/*Se añade la implementación de clase abstracto dado que la clase User es demasiado general para
* aplicar herencia.*/
public abstract class User {

    int id;
    String nombre;
    String email;
    String direccion;
    String numeroTelefonico;

    public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    /* Estos Metodos se quedan sin llaves, y sin codigo, solo se les da comportamiento
    cuando se herede/implemente
     */
    public abstract void muestraDatosUsuarios();
}
