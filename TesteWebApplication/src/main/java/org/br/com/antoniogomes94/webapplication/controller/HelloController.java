package org.br.com.antoniogomes94.webapplication.controller;

import br.com.antoniogomes94.webframework.annotations.*;
import org.br.com.antoniogomes94.webapplication.model.Produto;
import org.br.com.antoniogomes94.webapplication.service.Service;

@WebframeworkController
public class HelloController {

    @WebframeworkInject
    private Service service;

    @WebframeworkGetMethod("/hello")
    public String returnHelloWorld() {
        return "Return Hello world!!!";
    }

    @WebframeworkGetMethod("/produto")
    public Produto exibirProduto() {
        Produto p = new Produto(1,"Nome1",5432.1,"teste.jpg");
        return p;
    }

    @WebframeworkPostMethod("/produto")
    public Produto cadastrarProduto(@WebframeworkBody Produto produtoNovo) {
        System.out.println(produtoNovo);
        return produtoNovo;
    }

    @WebframeworkGetMethod("/teste")
    public String teste() {
        return "Testes";
    }

    @WebframeworkGetMethod("/injected")
    public String chamadaCustom() {
        return service.chamadaCustom("Hello injected");
    }

    //http://localhost:8080/retornavalor/OI == Retornando o valor de parametro: 22222
    @WebframeworkGetMethod("/retornavalor/{valor}")
    public String retornoValor(@WebframeworkPathVariable Double valor) {
        return "Retornando o valor de parametro: " + valor;
    }
}
