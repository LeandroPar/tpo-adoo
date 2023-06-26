import java.time.DateTimeException;
import java.time.LocalDate;

public class Prestamo {
    private int prestamoID;
    private Socio socio;
    private Ejemplar ejemplar;
    private int bibliotecarioID;
    private CondicionPrestamo condicion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int diasFaltantes;

    private int calcularDiasFaltantes(Socio socio, Ejemplar ejemplar) {
        if (ejemplar.getCategoria() == TipoCategoria.LIBRO) {
            return socio.getDiasPrestamo();
        } else {
            return socio.getDiasPrestamo()-5;
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "prestamoID=" + prestamoID +
                ", socio=" + socio +
                ", ejemplar=" + ejemplar +
                ", bibliotecarioID=" + bibliotecarioID +
                ", condicion=" + condicion +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", diasRestantes=" + diasFaltantes +
                '}';
    }

    public Prestamo(int prestamoID, Socio socio, Ejemplar ejemplar, int bibliotecarioID) {
        this.prestamoID = prestamoID;
        this.socio = socio;
        this.ejemplar = ejemplar;
        this.bibliotecarioID = bibliotecarioID;
        this.condicion = new EnTermino(this);
        this.fechaInicio = LocalDate.now();
        this.fechaFinal = LocalDate.now().plusDays(calcularDiasFaltantes(socio, ejemplar));
        this.diasFaltantes = calcularDiasFaltantes(socio, ejemplar);
    }
    public int getPrestamoID() {
        return prestamoID;
    }
    public void setPrestamoID(int prestamoID) {
        this.prestamoID = prestamoID;
    }
    public Socio getSocio() {
        return this.socio;
    }
    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    public Ejemplar getEjemplar() {
        return ejemplar;
    }
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
    public int getBibliotecarioID() {
        return bibliotecarioID;
    }
    public void setBibliotecarioID(int bibliotecarioID) {
        this.bibliotecarioID = bibliotecarioID;
    }
    public CondicionPrestamo getCondicion() {
        return condicion;
    }
    public void setCondicion(CondicionPrestamo condicion) {
        this.condicion = condicion;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getDiasFaltantes() {
        return diasFaltantes;
    }

    public void setDiasFaltantes(int diaFaltantes) {
        this.diasFaltantes = diasFaltantes;
    }
}
