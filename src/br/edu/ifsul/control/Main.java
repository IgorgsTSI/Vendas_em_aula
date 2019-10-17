package br.edu.ifsul.control;

import br.edu.ifsul.model.Cliente;
import br.edu.ifsul.model.ItemPedido;
import br.edu.ifsul.model.Pedido;
import br.edu.ifsul.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Ana");
        Produto produto = new Produto(1, "Arroz");
        ItemPedido itempedido = new ItemPedido(1,100, produto);
        ItemPedido itempedido2 = new ItemPedido(2, 20, produto);
        List<ItemPedido> itenspedidos = new ArrayList<>();
        itenspedidos.add(itempedido);
        itenspedidos.add(itempedido2);
        Pedido pedido =new Pedido(1, "aberto", cliente, itenspedidos);
        System.out.println(pedido);
    }
}
