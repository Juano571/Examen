/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.iccr.Evento;

import java.util.ArrayList;

/**
 * @author LabP4107
 */
public class Evento {

    private final Cliente cliente;
    private final Responsable responsable;
    private TipoEvento tipoEvento;
    private final NumeroAsistentes numeroAsistentes;
    private final Salon salon;
    private TipoTematica tipoTematica;
    private final ArrayList<TipoServicio> servicios;
    private int numeroServicios;
    private double precioComida;
    private double precioEvento;
    public Evento(String nombreResponsable, int numeroNiños, int numeroAdultos, String apellidoCliente, String nombrecliente, String contactoCliente) {
        this.numeroAsistentes = new NumeroAsistentes(numeroNiños, numeroAdultos);
        this.salon = new Salon();
        this.responsable = new Responsable(nombreResponsable);
        this.cliente = new Cliente(apellidoCliente, nombrecliente, contactoCliente);
        this.servicios = new ArrayList<>();
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public NumeroAsistentes getNumeroAsistentes() {
        return numeroAsistentes;
    }

    public String presentarServicios() {

        StringBuilder resultado = new StringBuilder();

        for (TipoServicio s : servicios) {
            if (s != null) {
                resultado.append(s).append(" - ");
            }
        }
        return resultado.toString();
    }

    public void llenarInformacion(NumeroAsistentes numeroAsistentes) throws Exception {
        this.numeroAsistentes.validarNumeroAsistentes();
        this.salon.asignarSalon(numeroAsistentes);
        this.salon.calcularValorSalon();
        this.calcularPrecioComida();
        this.calcularNumeroServicios();
        this.calculaPrecio();

    }


    public void calcularNumeroServicios() {
        this.numeroServicios = servicios.size();
    }
    public TipoTematica getTipoTematica() {
        return tipoTematica;
    }
    public void setTipoTematica(TipoTematica tipoTematica) {
        this.tipoTematica = tipoTematica;
    }
    public Salon getSalon() {
        return salon;
    }
    public void agregarServicio(TipoServicio servicio){
        this.servicios.add(servicio);
    }
    public double getPrecio() {
        return precioEvento;
    }
    public void calcularPrecioComida() {
        this.precioComida = 12 * this.numeroAsistentes.numeroNiñosAsistentes() + 25 * this.numeroAsistentes.numeroAdultosAsistentes();
    }
    public void calculaPrecio() {
        this.precioEvento = 150 + this.salon.getValor() + this.numeroServicios * 4.5
                + this.precioComida;
    }
    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.responsable.nombre() + ", tipoEvento=" + this.tipoEvento
                + ", ni\u00f1os=" + this.numeroAsistentes.numeroNiñosAsistentes() + ", adultos=" + this.numeroAsistentes.numeroAdultosAsistentes() + ", asistentesTotales="
                + this.numeroAsistentes.calcularAsistentesTotales() + ", tematica=" + this.tipoTematica + ", salon=" + this.salon.getTipoSalon()
                + ", valorSalon=" + this.salon.getValor() + ", precioEvento=" + this.precioEvento
                + ", apellidoCliente=" + this.cliente.apellido() + ", nombrecliente="
                + this.cliente.nombre() + ", contactoCliente=" + this.cliente.contacto()
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.numeroServicios
                + ", precioComida=" + this.precioComida + '}';
    }

}
