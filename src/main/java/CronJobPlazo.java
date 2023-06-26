import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.TimerTask;

import static java.lang.System.in;

public class CronJobPlazo extends TimerTask implements Sujeto{

    private List<CondicionPrestamo> prestamos;
    private LocalDate ultimaEjecucion;
    private List<ObserverPlazo> observers;
    private int diasFaltantes;

    public CronJobPlazo(){
        this.prestamos = new LinkedList<CondicionPrestamo>();
        this.ultimaEjecucion = LocalDate.now();
        this.observers = new LinkedList<ObserverPlazo>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo.getCondicion());
    }

    public void decrementarDiasFaltantes(){
        for (CondicionPrestamo condPrestamo : prestamos) {
            condPrestamo.prestamo.setDiasFaltantes(condPrestamo.prestamo.getDiasFaltantes()-1);
        }
        this.ultimaEjecucion = LocalDate.now();
        this.notificar();
    }

    @Override
    public void run() {
        System.out.println("Esto se imprime cada segundo");
        if (LocalTime.now().getSecond()%3==0) {
            System.out.println("Esto se imprime cad 3 segundos");
            this.decrementarDiasFaltantes();
        }
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

    public List<CondicionPrestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<CondicionPrestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public LocalDate getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public void setUltimaEjecucion(LocalDate ultimaEjecucion) {
        this.ultimaEjecucion = ultimaEjecucion;
    }

    public List<ObserverPlazo> getObservers() {
        return observers;
    }

    public void setObservers(List<ObserverPlazo> observers) {
        this.observers = observers;
    }

    public int getDiasFaltantes() {
        return diasFaltantes;
    }

    public void setDiasFaltantes(int diasFaltantes) {
        this.diasFaltantes = diasFaltantes;
    }
}
