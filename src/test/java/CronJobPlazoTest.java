import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Timer;

import static org.junit.jupiter.api.Assertions.*;

class CronJobPlazoTest {

    @Test
    void run() {
        Prestamo prestamo = new Prestamo(7, new Socio(7, "AE", "EA",14,"1450","ae", TipoMedioComunicacion.SMS), new Ejemplar(1, "Titulo","Autor", LocalDate.of(2023,06,22),TipoCategoria.LIBRO,true),4);

        Timer t = new Timer();
        CronJobPlazo tarea = new CronJobPlazo();

        CondicionPrestamoObserver plazoObs = new CondicionPrestamoObserver();
        tarea.agregar(plazoObs);

        t.scheduleAtFixedRate(tarea, 0,1000);


    }
}