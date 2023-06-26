import java.util.LinkedList;
import java.util.List;

public class NotificacionesController {

    private static NotificacionesController mensajeController;
    private List<Socio> socios;

    public static NotificacionesController getInstance(){
        if (mensajeController == null){
            mensajeController = new NotificacionesController();
            mensajeController.socios = new LinkedList<Socio>();
        }
        return mensajeController;
    }

    private Mensaje mensaje;
    private Socio socio;
    private TipoMedioComunicacion medioFav;

    public void enviarNotificacion(Mensaje mensaje, Socio socio, TipoMedioComunicacion medioFav){
        if(socio.getMedioFav() == TipoMedioComunicacion.SMS){
            AdaptadorSMS adapter = new AdaptadorSMS();
            adapter.sendSMS(socio.getTelefono(), mensaje.toString());
        }
        else if(socio.getMedioFav() == TipoMedioComunicacion.MAIL){
            AdaptadorMail adapter = new AdaptadorMail();
            adapter.send(socio.getMail(), mensaje.toString());
        }
        else{
            AdaptadorWPP adapter = new AdaptadorWPP();
            adapter.enviarMensaje(socio.getTelefono(), mensaje.toString());
        }
    }


    /*public void enviarNotificacion(Mensaje mensaje, Socio socio, TipoMedioComunicacion medioFav){
        if(socio.getMedioFav() == TipoMedioComunicacion.SMS){
            AdaptadorSMS adapter = new AdaptadorSMS();
            adapter.sendSMS(socio.getTelefono(), mensaje.toString());
        }
        else if(socio.getMedioFav() == TipoMedioComunicacion.MAIL){
            AdaptadorMail adapter = new AdaptadorMail();
            adapter.send(socio.getMail(), mensaje.toString());
        }
        else{
            AdaptadorWPP adapter = new AdaptadorWPP();
            adapter.enviarMensaje(socio.getTelefono(), mensaje.toString());
        }
    }
    */

}
