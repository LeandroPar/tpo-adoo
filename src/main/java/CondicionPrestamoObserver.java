public class CondicionPrestamoObserver extends ObserverPlazo{
    private Prestamo prestamo;


    public void actualizarEstado(Prestamo prestamo){
        if (prestamo.getDiasFaltantes() == -1)
            prestamo.getCondicion().vencido();
    }

    public void descontarDiasPrestamoSocio(Prestamo prestamo){
        if (prestamo.getDiasFaltantes() < 0)
                prestamo.getSocio().setDiasPrestamo(prestamo.getSocio().getDiasPrestamo()-1);
        }

    public void suspenderSocio(){
        if (prestamo.getSocio().getDiasPrestamo() == 0)
            prestamo.getSocio().setSuspendido(true);
    }

}
