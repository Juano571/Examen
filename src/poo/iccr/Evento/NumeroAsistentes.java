package poo.iccr.Evento;

public class NumeroAsistentes {
    private int numeroNiñosAsistentes;
    private int numeroAdultosAsistentes;

    public NumeroAsistentes(int numeroNiñosAsistentes, int numeroAdultosAsistentes) {
        this.numeroNiñosAsistentes = numeroNiñosAsistentes;
        this.numeroAdultosAsistentes = numeroAdultosAsistentes;
    }

    public int getNumeroNiñosAsistentes() {
        return numeroNiñosAsistentes;
    }

    public void setNumeroNiñosAsistentes(int numeroNiñosAsistentes) {
        this.numeroNiñosAsistentes = numeroNiñosAsistentes;
    }

    public int getNumeroAdultosAsistentes() {
        return numeroAdultosAsistentes;
    }

    public void setNumeroAdultosAsistentes(int numeroAdultosAsistentes) {
        this.numeroAdultosAsistentes = numeroAdultosAsistentes;
    }

    public int calcularAsistentesTotales() {
        return numeroAdultosAsistentes + numeroNiñosAsistentes;
    }

    public void validarNumeroAsistentes() throws Exception {
        int numeroAsistentesTotales = this.calcularAsistentesTotales();
        if (numeroAsistentesTotales < 15 || numeroAsistentesTotales > 60) {
            throw new Exception("Numero incorrecto de asistentes");
        }
    }
}
