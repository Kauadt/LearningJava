package com.kauadt.javacore.Kenum.test;

import com.kauadt.javacore.Kenum.domain.Cliente;
import com.kauadt.javacore.Kenum.domain.TipoPagamento;
import com.kauadt.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.findByAttribute("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
