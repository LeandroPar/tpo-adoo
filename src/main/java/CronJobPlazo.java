import java.time.LocalDateTime;
import java.util.List;
import java.util.TimerTask;

import static java.lang.System.in;

public class CronJobPlazo extends TimerTask implements Sujeto{

    private List<CondicionPrestamo> prestamos;
    private LocalDateTime ultimaEjecucion;
    private List<ObserverPlazo> observers;
    private int diasFaltantes;

    public CronJobPlazo(){
        for (CondicionPrestamo estadoPrestamo: prestamos) {
            diasFaltantes = estadoPrestamo.prestamo.getDiasFaltantes();
            estadoPrestamo.prestamo.setDiasFaltantes(diasFaltantes-1);
        }
        this.notificar();
    }
    @Override
    public void run() {
        System.out.println("Hi see you after 10 seconds");
    }

    @Override
    public void agregar(ObserverPlazo observador) {
        this.observers.add(observador);
        System.out.println("Suscribiendo observador");
    }

    @Override
    public void eliminar(ObserverPlazo observador) {
        this.observers.remove(observador);
        System.out.println("Desuscribiendo observador");
    }

    @Override
    public void notificar() {
        // this.observers.forEach(observer -> observer.actualizar(this));
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).actualizar(this);
        }
    }


}
