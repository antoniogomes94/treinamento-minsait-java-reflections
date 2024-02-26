package org.br.com.antoniogomes94.webapplication.controller;

import br.com.antoniogomes94.webframework.annotations.*;
import org.br.com.antoniogomes94.webapplication.model.Produto;
import org.br.com.antoniogomes94.webapplication.service.Service;

@WebframeworkController
public class HelloController {

    @WebframeworkInject
    private Service iService;

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
        return iService.chamadaCustom("Hello injected");
    }
}
