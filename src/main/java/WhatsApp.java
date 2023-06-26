public class WhatsApp extends Notificacion{
        private String telefono;
        private AdaptadorWPP api;

        public WhatsApp(String telefono) {
            this.telefono = telefono;
            this.api = new AdaptadorWPP();
        }

       // @Override
        public void crearNotificacion(String mensaje) {
            this.api.enviarMensaje(telefono, mensaje);
        }
}
