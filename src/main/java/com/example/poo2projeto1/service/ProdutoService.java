package com.example.poo2projeto1.service;

import java.util.HashMap;
import java.util.List;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.repository.ProdutoRepository;
//import com.example.poo2projeto1.repository.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    public Produto getProdutoById(int codigo)
    {
        Produto produto = pr.getProdutoById(codigo);
        
        if(produto != null){
            if(produto.getCodigo()!=codigo){
                produto = null;
            }
        }
        
        return produto;

    }

    public Produto[] getProdutosEmEstoque()
    {
        int i;
        Produto temp;
        ArrayList<Integer> produtos = new ArrayList();
        for(i=0;i<10;i++)
        {
            temp = pr.getProdutoById(i);
            if(temp.getCodigo()==i+1 &&temp.getEstoque()>0)
            {
                produtos.put(temp);
            }
        }
        return produtos;
    }


}