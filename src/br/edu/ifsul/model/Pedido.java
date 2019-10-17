package br.edu.ifsul.model;

import java.util.List;

public class Pedido {
    private int id;
    private String estado;
    private Cliente cliente;
    private List<ItemPedido> itenspedidos;

    public Pedido(int id, String estado, Cliente cliente, List<ItemPedido> itenspedidos) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.itenspedidos = itenspedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                ", itenspedidos=" + itenspedidos +
                '}';
    }
}
