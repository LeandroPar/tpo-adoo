public class SMS implements INotificacion {
    private String telefono;

    public SMS(String telefono) {
        this.telefono = telefono;
    }

    public final void sendSMS(String recipient, String message ) {
        System.out.printf("Mandando SMS %s el mensaje: %s\n", recipient, message);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.sendSMS(telefono, mensaje);
    }
}
