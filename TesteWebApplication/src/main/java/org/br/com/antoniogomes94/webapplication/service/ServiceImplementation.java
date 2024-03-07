package org.br.com.antoniogomes94.webapplication.service;

import br.com.antoniogomes94.webframework.annotations.WebframeworkService;
import br.com.antoniogomes94.webframework.util.WebFrameworkLogger;
import org.br.com.antoniogomes94.webapplication.model.Produto;
import org.br.com.antoniogomes94.webapplication.model.ProdutoDTO;

@WebframeworkService
public class ServiceImplementation implements Service {

    @Override
    public String chamadaCustom(String mensagem) {
        return "Teste chamada servico: " + mensagem;
    }
    @Override
    public ProdutoDTO atualizaProduto(Integer id, ProdutoDTO updateProduto) throws Exception {

        // produto recuperado da base de dados
        Produto p = new Produto(1,"Nome1",5432.1,"teste.jpg");
        ProdutoDTO produtoAtualizado = new ProdutoDTO();

        if ( p.getId() == id ) {
            produtoAtualizado.setId(p.getId());
            produtoAtualizado.setNome(updateProduto.getNome());
            produtoAtualizado.setValor(updateProduto.getValor());
            produtoAtualizado.setLinkFoto(updateProduto.getLinkFoto());

        } else {

            WebFrameworkLogger.log("HelloController", "produto ID: " + id + " inexistente!");
            throw new Exception("produto ID: " + id + " inexistente!");

        }

        return produtoAtualizado;
    }

    @Override
    public String deletarProduto(Integer id) {
        return "Produto deletado com sucesso, ID : " + id;
    }
}
