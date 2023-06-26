public class Bibliotecario extends Usuario{
    private int bibliotecarioID;

    public Bibliotecario(int bibliotecarioID) {
        this.bibliotecarioID = bibliotecarioID;
    }

    public int getBibliotecarioID() {
        return bibliotecarioID;
    }

    public void setBibliotecarioID(int bibliotecarioID) {
        this.bibliotecarioID = bibliotecarioID;
    }
}
