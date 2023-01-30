package poo.iccr.Evento;

public record NumeroAsistentes(int numeroNiñosAsistentes, int numeroAdultosAsistentes) {

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
