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
        if (numeroAsistentesTotales > 15 && numeroAsistentesTotales <= 25) {
            this.tipoSalon = PLATINO;
        }
        if (numeroAsistentesTotales >= 26 && numeroAsistentesTotales <= 45) {
            this.tipoSalon = ESMERALDA;
        }
        if (numeroAsistentesTotales > 45) {
            this.tipoSalon = DIAMANTE;
        }
    }

    public void calcularValorSalon(){
        if(this.tipoSalon.equals(PLATINO)){
            this.valor = 350;
        }
        if(this.tipoSalon.equals(ESMERALDA)){
            this.valor = 425;
        }
        if(this.tipoSalon.equals(DIAMANTE)){
            this.valor = 500;
        }
    }
}
