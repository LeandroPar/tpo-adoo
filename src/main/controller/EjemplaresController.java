public class EjemplaresController {

    private static EjemplaresController ejemplaresController;

    public static EjemplaresController getInstance(){
        if (ejemplaresController == null){
            ejemplaresController = new EjemplaresController();
        }
        return ejemplaresController;
    }
}
