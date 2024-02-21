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
        return "Hello world!!!";
    }

    @WebframeworkGetMethod("/produto")
    public Produto exibirPorduto() {
        Produto p = new Produto(1,"Nome1",2000.0,"teste.jpg");
        return p;
    }

    @WebframeworkPostMethod("/produto")
    public String cadastrarProduto(@WebframeworkBody Produto produtoNovo) {
        System.out.println(produtoNovo);
        return "Produto cadastrado";
    }

    public String teste() {
        return "Testes";
    }


}
