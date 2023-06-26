import java.time.LocalDate;

public class EnTermino extends CondicionPrestamo{

    public EnTermino(Prestamo prestamo) {super(prestamo);}

    public void vencido() {
        prestamo.setCondicion(new FueraDeTermino(prestamo));
    }

    public void decrementar() {
        prestamo.setDiasFaltantes(prestamo.getDiasFaltantes()-1);
    }


}
