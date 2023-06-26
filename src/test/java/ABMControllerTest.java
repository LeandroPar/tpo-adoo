import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class ABMControllerTest {

    @Test
    void alta() {
        EjemplaresController ejemplaresController = EjemplaresController.getInstance();
        //MensajesController mensajesController = MensajesController.getInstance();
        PrestamosController prestamosController = PrestamosController.getInstance();
        UsuariosController usuariosController = UsuariosController.getInstance();

        ejemplaresController.altaEjemplar(1,"Titulo","Autor", LocalDate.of(2022,04,06),TipoCategoria.valueOf("LIBRO"),true);
        System.out.println(ejemplaresController.buscarEjemplar(1).toString());

        usuariosController.altaSocio(1, "Nombre", "Apellido", 174841, "44012500", "correo@gmail.com", TipoMedioComunicacion.valueOf("SMS"));
        System.out.println(usuariosController.buscarSocio(1).toString());
        System.out.println(usuariosController.buscarSocio(1).getHistorial().size());

        prestamosController.altaPrestamo(1, usuariosController.buscarSocio(1), ejemplaresController.buscarEjemplar(1), 1);
        System.out.println(prestamosController.buscarPrestamo(1).toString());
        prestamosController.concretarPrestamo(1);
        System.out.println(usuariosController.buscarSocio(1).getHistorial().size());


        ejemplaresController.bajaEjemplar(1);
        usuariosController.bajaSocio(1);
    }
}