import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PrestamosController {

    private static PrestamosController prestamosController;
    private List<Prestamo> prestamos;

    public static PrestamosController getInstance(){
        if (prestamosController == null){
            prestamosController = new PrestamosController();
            prestamosController.prestamos = new LinkedList<Prestamo>();
        }
        return prestamosController;
    }

    public void altaPrestamo(int prestamoID, Socio socio, Ejemplar ejemplar, int bibliotecarioID) {
        Prestamo prestamo = new Prestamo(prestamoID, socio, ejemplar, bibliotecarioID);
        prestamos.add(prestamo);
        prestamo.getEjemplar().setDisponible(false);
    }

    public Prestamo buscarPrestamo(int prestamoID){
        int i = 0;
        while(this.prestamos.get(i).getPrestamoID() != prestamoID && i < this.prestamos.size()){
            i++;
        }
        if(this.prestamos.get(i).getPrestamoID() == prestamoID) {
            return this.prestamos.get(i);
        }
        else{
            return null;
        }
    }

    public void concretarPrestamo(int prestamoID){
        Prestamo prestamo = buscarPrestamo(prestamoID);
        if(prestamo.getDiasFaltantes() >= 0){
            prestamo.getSocio().setPremio(prestamo.getSocio().getPremio()+1);
            if(prestamo.getSocio().getPremio() == 5) {
                prestamo.getSocio().setDiasPrestamo(prestamo.getSocio().getDiasPrestamo() + 1);
                prestamo.getSocio().setPremio(0);
            }
            else {
                prestamo.getSocio().setDiasPrestamo(prestamo.getSocio().getDiasPrestamo() + prestamo.getDiasFaltantes());
            }
        }
        prestamo.getSocio().addHistorial(prestamo);
        prestamo.getEjemplar().setDisponible(true);
        prestamos.remove(prestamo);
    }

    public void modificarPlazos(int prestamoID, int dias) {
        Prestamo prestamo = buscarPrestamo(prestamoID);
        prestamo.setFechaFinal(prestamo.getFechaFinal().plusDays(dias));
        prestamo.setDiasFaltantes(prestamo.getDiasFaltantes()+dias);
    }


}
