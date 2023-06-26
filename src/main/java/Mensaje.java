import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {
    private String texto;
    private TipoMotivo motivo;
    private LocalDate fecha;

    public Mensaje(String texto, TipoMotivo motivo){
        this.texto =texto;
        this.motivo =motivo;
        this.fecha = LocalDate.now();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMotivo getMotivo() {
        return motivo;
    }

    public void setMotivo(TipoMotivo motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
