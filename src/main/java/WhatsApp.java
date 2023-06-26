public class WhatsApp implements INotificacion {
    private String telefono;

    public WhatsApp(String telefono) {
        this.telefono = telefono;
    }

    public final void enviarMensaje(String phone, String message) {
        System.out.printf("Mandando a telefono %s el mensaje: %s\n", phone, message);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.enviarMensaje(telefono, mensaje);
    }
}
