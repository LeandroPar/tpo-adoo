public class NotificacionSMS extends Notificacion{
    private Mensaje mensaje;
    private Socio socio;
    private TipoMedioComunicacion medioFav;

    public Notificacion crearNotificacion(Mensaje mensaje, Socio socio, TipoMedioComunicacion medioFav){
        Notificacion notificacion = new NotificacionSMS();

        return notificacion;
    }

}
