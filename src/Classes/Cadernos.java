package Classes;

public class Cadernos {
    private String capaModelo;
    private int paginas;
    private int materias;
    private Figurinhas figurinhas;

    public Cadernos(String capaModelo, int paginas, int materias, Figurinhas figurinhas) {
        this.capaModelo = capaModelo;
        this.paginas = paginas;
        this.materias = materias;
        this.figurinhas = figurinhas;
    }

    public Figurinhas getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(Figurinhas figurinhas) {
        this.figurinhas = figurinhas;
    }

    public String getCapaModelo() {
        return capaModelo;
    }

    public void setCapaModelo(String capaModelo) {
        this.capaModelo = capaModelo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Cadernos{" +
                "capaModelo='" + capaModelo + '\'' +
                ", paginas=" + paginas +
                ", materias=" + materias +
                '}';
    }
}
