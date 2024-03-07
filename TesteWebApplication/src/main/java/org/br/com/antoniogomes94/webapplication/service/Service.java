package org.br.com.antoniogomes94.webapplication.service;

import org.br.com.antoniogomes94.webapplication.model.ProdutoDTO;

public interface Service {
    public String chamadaCustom(String mensagem);
    public ProdutoDTO atualizaProduto(Integer id, ProdutoDTO updateProduto) throws Exception;
    public String deletarProduto(Integer id);
}