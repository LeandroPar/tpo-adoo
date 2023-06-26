import java.time.LocalDate;
import java.time.LocalDateTime;

public class NotificadorObserver extends ObserverPlazo{
    private LocalDateTime fecha;
    private int diasFaltantes;
    private CondicionPrestamo plazo;

    public void notificarMotivo(Prestamo prestamo){
        if (prestamo.getDiasFaltantes() == 1) {
            Mensaje mensaje = new Mensaje("Está por vencer tu prestamo.", TipoMotivo.VENCIMIENTO_PROXIMO);
        }
    }



}
