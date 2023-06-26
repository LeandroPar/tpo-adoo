public interface Sujeto {
    void agregar(ObserverPlazo observador);
    void eliminar(ObserverPlazo observador);
    void notificar();

}
