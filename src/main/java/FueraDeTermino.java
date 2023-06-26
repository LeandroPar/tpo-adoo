import java.time.LocalDateTime;

public class FueraDeTermino extends CondicionPrestamo{

    public FueraDeTermino(Prestamo prestamo) {super(prestamo);}
    @Override
    public void vencido() {}

    @Override
    public void decrementar() {
        prestamo.setDiasFaltantes(prestamo.getDiasFaltantes()-1);
    }
}
