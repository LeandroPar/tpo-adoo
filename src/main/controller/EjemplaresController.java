import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class EjemplaresController {

    private static EjemplaresController ejemplaresController;

    public static EjemplaresController getInstance(){
        if (ejemplaresController == null){
            ejemplaresController = new EjemplaresController();
            ejemplaresController.ejemplares = new LinkedList<Ejemplar>();
        }
        return ejemplaresController;
    }

    public void altaEjemplar(int ejemplarID, String titulo, String autor, LocalDate fechaPubli, TipoCategoria categoria, boolean disponible) {
        Ejemplar ejemplar = new Ejemplar(ejemplarID, titulo, autor, fechaPubli, categoria, disponible);
        ejemplares.add(ejemplar);
    }

    public Ejemplar buscarEjemplar(int ejemplarID){
        int i = 0;
        while(this.ejemplares.get(i).getEjemplarID() != ejemplarID && i < this.ejemplares.size()){
            i++;
        }
        if(this.ejemplares.get(i).getEjemplarID() == ejemplarID) {
            return this.ejemplares.get(i);
        }
        else{
            return null;
        }
    }

    public void bajaEjemplar(int ejemplarID){
        Ejemplar ejemplar = buscarEjemplar(ejemplarID);
        ejemplares.remove(ejemplar);
    }




}
