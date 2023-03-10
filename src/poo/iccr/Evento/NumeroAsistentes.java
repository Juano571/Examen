package poo.iccr.Evento;

public record NumeroAsistentes(int numeroNi├▒osAsistentes, int numeroAdultosAsistentes) {

    public int calcularAsistentesTotales() {
        return numeroAdultosAsistentes + numeroNi├▒osAsistentes;
    }

    public void validarNumeroAsistentes() throws Exception {
        int numeroAsistentesTotales = this.calcularAsistentesTotales();
        if (numeroAsistentesTotales < 15 || numeroAsistentesTotales > 60) {
            throw new Exception("Numero incorrecto de asistentes");
        }
    }
}
