public class PrestamosController {

    private static PrestamosController prestamosController;

    public static PrestamosController getInstance(){
        if (prestamosController == null){
            prestamosController = new PrestamosController();
        }
        return prestamosController;
    }
}
