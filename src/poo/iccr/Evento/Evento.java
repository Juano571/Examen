/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.iccr.Evento;

/**
 *
 * @author LabP4107
 */
public class Evento {

    private Responsable responsable;
    private TipoEvento tipoEvento;

    private NumeroAsistentes numeroAsistentes;
    private Salon salon;
    private TipoTematica tipoTematica;
    private double precioEvento;
    private String apellidoCliente;
    private String nombrecliente;
    private int contactoCliente;

    private String[] servicios = new String[5];
    private int numeroServicios;
    private double precioComida;

    public Evento(String nombreResponsable, int numeroNiños, int numeroAdultos, String apellidoCliente, String nombrecliente, int contactoCliente) {
        this.numeroAsistentes = new NumeroAsistentes(numeroNiños, numeroAdultos);
        this.salon = new Salon();
        this.responsable = new Responsable(nombreResponsable);
        this.apellidoCliente = apellidoCliente;
        this.nombrecliente = nombrecliente;
        this.contactoCliente = contactoCliente;
    }

    public Responsable getResponsable() {
        return responsable;
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

    public void setNumeroAsistentes(NumeroAsistentes numeroAsistentes) {
        this.numeroAsistentes = numeroAsistentes;
    }
    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String[] getServicios() {
        return servicios;
    }

    public void setServicios(String[] servicios) {
        this.servicios = servicios;
    }

    public String presentarServicios() {

        String resultado = "";

        for (String s : servicios) {
            if (s != null) {
                resultado += s + " - ";
            }
        }
        return resultado;
    }

    public void numeroServicios() {
        int contador = 0;
        for (String s : servicios) {
            if (s != null) {
                contador += 1;
            }

        }
        this.numeroServicios = contador;
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

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public double getPrecio() {
        return precioEvento;
    }

    public void setPrecio(double precio) {
        this.precioEvento = precio;
    }

    public int getContactoCliente() {
        return contactoCliente;
    }

    /**
     * Metodo que permite asignar un valor a la variable de instancia
     * contactoCliente
     *
     * @param contactoCliente numero telefonico que se va a guardar
     */
    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
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
                + ", apellidoCliente=" + this.apellidoCliente + ", nombrecliente="
                + this.nombrecliente + ", contactoCliente=" + this.contactoCliente
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.numeroServicios
                + ", precioComida=" + this.precioComida + '}';
    }

}
