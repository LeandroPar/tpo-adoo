import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EnTerminoTest {

    @Test
    void vencido() {
        Prestamo prestamo = new Prestamo(7, new Socio(7, "AE", "EA",14,"1450","ae", TipoMedioComunicacion.SMS), new Ejemplar(1, "Titulo","Autor", LocalDateTime.of(2023, 05, 05, 12, 30),TipoCategoria.LIBRO,true),4);
        System.out.println(prestamo.getDiasFaltantes());
        prestamo.getCondicion().decrementar();
        System.out.println(prestamo.getDiasFaltantes());
    }

    //@Test
    //void decrementar() {
        //Prestamo prestamo = new Prestamo(7, new Socio(7, "AE", "EA",14,"1450","ae", TipoMedioComunicacion.SMS), new Ejemplar(1, "Titulo","Autor", LocalDateTime.of(2023, 05, 05, 12, 30),TipoCategoria.LIBRO,true),4);
    //}
}