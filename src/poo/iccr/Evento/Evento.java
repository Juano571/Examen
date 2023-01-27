/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.iccr.Evento;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author LabP4107
 */
public class Evento {

    private Cliente cliente;
    private Responsable responsable;
    private TipoEvento tipoEvento;
    private NumeroAsistentes numeroAsistentes;
    private Salon salon;
    private TipoTematica tipoTematica;
    private ArrayList<TipoServicio> servicios;
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

        String resultado = "";

        for (TipoServicio s : servicios) {
            if (s != null) {
                resultado += s + " - ";
            }
        }
        return resultado;
    }
    public void numeroServicios() {
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
    public void Comida() {
        this.precioComida = 12 * this.numeroAsistentes.getNumeroNiñosAsistentes() + 25 * this.numeroAsistentes.getNumeroAdultosAsistentes();
    }
    public void calculaPrecio() {
        this.precioEvento = 150 + this.salon.getValor() + this.numeroServicios * 4.5
                + this.precioComida;
    }
    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.responsable.getNombre() + ", tipoEvento=" + this.tipoEvento
                + ", ni\u00f1os=" + this.numeroAsistentes.getNumeroNiñosAsistentes() + ", adultos=" + this.numeroAsistentes.getNumeroAdultosAsistentes() + ", asistentesTotales="
                + this.numeroAsistentes.calcularAsistentesTotales() + ", tematica=" + this.tipoTematica + ", salon=" + this.salon.getTipoSalon()
                + ", valorSalon=" + this.salon.getValor() + ", precioEvento=" + this.precioEvento
                + ", apellidoCliente=" + this.cliente.getApellido() + ", nombrecliente="
                + this.cliente.getNombre() + ", contactoCliente=" + this.cliente.getContacto()
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.numeroServicios
                + ", precioComida=" + this.precioComida + '}';
    }

}
