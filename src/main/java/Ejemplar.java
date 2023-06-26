import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ejemplar {

    private int ejemplarID;
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private TipoCategoria categoria;
    private boolean disponible;

    public Ejemplar(int ejemplarID, String titulo, String autor, LocalDate fechaPublicacion, TipoCategoria categoria, boolean disponible) {
        this.ejemplarID = ejemplarID;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "ejemplarID=" + ejemplarID +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", categoria=" + categoria +
                ", disponible=" + disponible +
                '}';
    }

    public int getEjemplarID() {
        return ejemplarID;
    }

    public void setEjemplarID(int ejemplarID) {
        this.ejemplarID = ejemplarID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



}
