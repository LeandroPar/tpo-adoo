import java.time.LocalDate;
import java.util.Timer;

public class main {
    public static void main(String[] args) {
        Timer t = new Timer();
        CronJobPlazo mTask = new CronJobPlazo();
        Prestamo prestamo = new Prestamo(7, new Socio(7, "AE", "EA",14,"1450","ae", TipoMedioComunicacion.SMS), new Ejemplar(1, "Titulo","Autor", LocalDate.of(2023,06,22),TipoCategoria.LIBRO,true),4);


        CondicionPrestamoObserver observ = new CondicionPrestamoObserver();
        mTask.agregar(observ);
        mTask.agregarPrestamo(prestamo);

        t.scheduleAtFixedRate(mTask,0,1000 );

        EjemplaresController ejemplaresController = EjemplaresController.getInstance();
        //MensajesController mensajesController = MensajesController.getInstance();
        PrestamosController prestamosController = PrestamosController.getInstance();
        UsuariosController usuariosController = UsuariosController.getInstance();


    }

}
