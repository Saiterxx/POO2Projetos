package com.example.poo2projeto1.service;

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


}