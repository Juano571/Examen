package poo.iccr.Evento;

import static poo.iccr.Evento.TipoSalon.*;

public class Salon {
    private TipoSalon tipoSalon;
    private double valor;

    public Salon() {
    }

    public TipoSalon getTipoSalon() {
        return tipoSalon;
    }

    public double getValor() {
        return valor;
    }

    public void asignarSalon(NumeroAsistentes numeroAsistentes) {
        int numeroAsistentesTotales = numeroAsistentes.calcularAsistentesTotales();
        if (numeroAsistentesTotales > 15 && numeroAsistentesTotales <= 25) this.tipoSalon = PLATINO;
        if (numeroAsistentesTotales >= 26 && numeroAsistentesTotales <= 45) this.tipoSalon = ESMERALDA;
        if (numeroAsistentesTotales > 45) this.tipoSalon = DIAMANTE;
    }

    public void calcularValorSalon(){

        switch (this.tipoSalon){
            case PLATINO -> this.valor = 350;
            case DIAMANTE -> this.valor = 425;
            case ESMERALDA -> this.valor = 500;
        }
   }
}
