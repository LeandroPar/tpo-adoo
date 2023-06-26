public class MensajesController{

    private static MensajesController mensajeController;

    public static MensajesController getInstance(){
        if (mensajeController == null){
            mensajeController = new MensajesController();
        }
        return mensajeController;
    }

    private Mensaje mensaje;
    private Socio socio;
    private TipoMedioComunicacion medioFav;

    public  void enviarMesnaje(){

    }


}
