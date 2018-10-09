package gradle.cucumber;

public class Boomberman {
    private Integer vida;
    private Celda celda;

    public Boomberman() {
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getVida() {
        return vida;
    }

    public void setCeldaInicial(Celda celda) {
        this.celda = celda;
    }

    public Celda getCelda() {
        return celda;
    }
}
