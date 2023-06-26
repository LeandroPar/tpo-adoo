public class Email implements INotificacion {
    private String mail;

    public Email(String mail) {
        this.mail = mail;
    }

    public final void send(String email, String body) {
        System.out.printf("Mandando a mail %s el mensaje: %s\n", email, body);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        this.send(mail, mensaje);
    }
}
