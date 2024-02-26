package org.br.com.antoniogomes94.webapplication.controller;

import br.com.antoniogomes94.webframework.annotations.WebframeworkBody;
import br.com.antoniogomes94.webframework.annotations.WebframeworkController;
import br.com.antoniogomes94.webframework.annotations.WebframeworkGetMethod;
import br.com.antoniogomes94.webframework.annotations.WebframeworkPostMethod;
import org.br.com.antoniogomes94.webapplication.model.Produto;

@WebframeworkController
public class HelloController {

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
    public String cadastrarProduto(@WebframeworkBody Produto produtoNovo) {
        System.out.println(produtoNovo);
        return "Produto cadastrado";
    }

    @WebframeworkGetMethod("/teste")
    public String teste() {
        return "Testes";
    }
}
