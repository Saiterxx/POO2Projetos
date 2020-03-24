package com.example.poo2projeto1.service;

import java.util.ArrayList;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.repository.ProdutoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutosAcimaDeService {

    @Autowired
    private ProdutoRepository pr;

	public ArrayList<Produto> getProdutosAcimaDe(Double valor) {
        int i;
        Produto temp;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for(i=1;i<11;i++)
        {
            temp = pr.getProdutoById(i);
            if(temp.getCodigo()==i && temp.getValor()>valor)
            {
                produtos.add(temp);
            }
            temp = new Produto();
        }
        return produtos;
	}
    

}