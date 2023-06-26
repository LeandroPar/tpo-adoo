import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class UsuariosController {

    private static UsuariosController usuariosController;
    private List<Socio> socios;
    private List<Bibliotecario> bibliotecarios;

    public static UsuariosController getInstance(){
        if (usuariosController == null){
            usuariosController = new UsuariosController();
            usuariosController.socios = new LinkedList<Socio>();
            usuariosController.bibliotecarios = new LinkedList<Bibliotecario>();
        }
        return usuariosController;
    }

    public void altaSocio(int socioID, String nombre, String apellido, int dni, String telefono, String mail, TipoMedioComunicacion medioFav) {
        Socio socio = new Socio(socioID,nombre,apellido,dni,telefono,mail,medioFav);
        socios.add(socio);
    }

    public Socio buscarSocio(int socioID){
        int i = 0;
        while(this.socios.get(i).getSocioID() != socioID && i < this.socios.size()){
            i++;
        }
        if(this.socios.get(i).getSocioID() == socioID) {
            return this.socios.get(i);
        }
        else{
            return null;
        }
    }

    public void bajaSocio(int socioID){
        Socio socio = buscarSocio(socioID);
        socios.remove(socio);
    }

    public void altaBibliotecario(int bibliotecarioID) {
        Bibliotecario bibliotecario = new Bibliotecario(bibliotecarioID);
        bibliotecarios.add(bibliotecario);
    }

    public Bibliotecario buscarBibliotecario(int bibliotecarioID){
        int i = 0;
        while(this.bibliotecarios.get(i).getBibliotecarioID() != bibliotecarioID && i < this.bibliotecarios.size()){
            i++;
        }
        if(this.bibliotecarios.get(i).getBibliotecarioID() == bibliotecarioID) {
            return this.bibliotecarios.get(i);
        }
        else{
            return null;
        }
    }

    public void bajaBibliotecario(int bibliotecarioID){
        Bibliotecario bibliotecario = buscarBibliotecario(bibliotecarioID);
        bibliotecarios.remove(bibliotecario);
    }
}
