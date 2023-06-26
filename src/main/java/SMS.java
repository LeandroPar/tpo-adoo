public class SMS extends Notificacion {
    private String telefono;
    private AdaptadorSMS api;

    public SMS(String telefono) {
        this.telefono = telefono;
        this.api = new AdaptadorSMS();
    }

    //@Override
    public void crearNotificacion(String mensaje) {
        this.api.sendSMS(telefono, mensaje);
    }
}
