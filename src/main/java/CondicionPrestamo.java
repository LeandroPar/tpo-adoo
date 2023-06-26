import java.time.LocalDate;
import java.time.Period;

public abstract class CondicionPrestamo {
    protected Prestamo prestamo;

    public CondicionPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public abstract void vencido();
    public abstract void decrementar();

}
