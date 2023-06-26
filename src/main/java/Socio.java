import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Socio extends Usuario{

    private int socioID;
    private String nombre;
    private String apellido;
    private int dni;
    private String telefono;
    private String mail;
    private TipoMedioComunicacion medioFav;
    private int diasPrestamo;
    private int premio;
    private boolean suspendido;
    private List<Prestamo> historial;


    public Socio(int socioID, String nombre, String apellido, int dni, String telefono, String mail, TipoMedioComunicacion medioFav) {
        this.socioID = socioID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.medioFav = medioFav;
        this.diasPrestamo = 10;
        this.premio = 0;
        this.suspendido = false;
        this.historial = new ArrayList<Prestamo>();
    }

    public int getSocioID() {
        return socioID;
    }

    public void setSocioID(int socioID) {
        this.socioID = socioID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public TipoMedioComunicacion getMedioFav() {
        return medioFav;
    }

    public void setMedioFav(TipoMedioComunicacion medioFav) {
        this.medioFav = medioFav;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public boolean isSuspendido() {
        return suspendido;
    }

    public void setSuspendido(boolean suspendido) {
        this.suspendido = suspendido;
    }

    public List<Prestamo> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Prestamo> historial) {
        this.historial = historial;
    }
}


