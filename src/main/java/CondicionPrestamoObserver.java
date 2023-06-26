import java.time.LocalDate;

public class CondicionPrestamoObserver extends ObserverPlazo{
    private LocalDate ultimaFechaEjecucion;
    private Prestamo prestamo;

    public void actualizar(CronJobPlazo observable) {
        System.out.println("Check");
        LocalDate fechaUpdate = (observable.getUltimaEjecucion());
        if (this.ultimaFechaEjecucion!=fechaUpdate) {
            actualizarEstado(this.prestamo);
            descontarDiasPrestamoSocio(this.prestamo);
            suspenderSocio(this.prestamo);
        }
        this.ultimaFechaEjecucion = ultimaFechaEjecucion.plusDays(1);
    }

    public void actualizarEstado(Prestamo prestamo){
        if (prestamo.getDiasFaltantes() == -1)
            prestamo.getCondicion().vencido();
    }

    public void descontarDiasPrestamoSocio(Prestamo prestamo){
        if (prestamo.getDiasFaltantes() < 0)
                prestamo.getSocio().setDiasPrestamo(prestamo.getSocio().getDiasPrestamo()-1);
        }

    public void suspenderSocio(Prestamo prestamo){
        if (prestamo.getSocio().getDiasPrestamo() == 0)
            prestamo.getSocio().setSuspendido(true);
    }

}
