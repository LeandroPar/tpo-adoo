public class AdaptadorSMS {
    public final void sendSMS(String recipient, String message ) {
        System.out.printf("Mandando SMS %s el mensaje: %s\n", recipient, message);
    }
}
