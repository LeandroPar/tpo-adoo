public class Email extends Notificacion {
    private String mail;
    private AdaptadorMail api;

    public Email(String mail) {
        this.mail = mail;
        this.api = new AdaptadorMail();
    }

    public void crearNotificacion(String mensaje) {
        this.api.send(mail, mensaje);
    }
}
