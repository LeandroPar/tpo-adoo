public class UsuariosController {

    private static UsuariosController usuariosController;

    public static UsuariosController getInstance(){
        if (usuariosController == null){
            usuariosController = new UsuariosController();
        }
        return usuariosController;
    }
}
