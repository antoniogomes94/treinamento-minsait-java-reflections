package org.br.com.antoniogomes94.webapplication.service;

import br.com.antoniogomes94.webframework.annotations.WebframeworkService;

@WebframeworkService
public class ServiceImplementation implements Service {

    @Override
    public String chamadaCustom(String mensagem) {
        return "Teste chamada servico: " + mensagem;
    }

}
