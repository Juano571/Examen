package poo.iccr.Evento;

public class Cliente {
    private String apellido;
    private String nombre;
    private String contacto;

    public Cliente(String apellido, String nombre, String contacto) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}