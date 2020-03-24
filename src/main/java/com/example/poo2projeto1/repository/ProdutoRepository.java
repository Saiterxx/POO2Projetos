package com.example.poo2projeto1.repository;
import java.util.HashMap;

import com.example.poo2projeto1.model.Produto;

import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {

    public HashMap<Integer, Produto> hm = new HashMap<Integer, Produto>();

    public ProdutoRepository()
    {
        hm.put(1,new Produto(1,"Pneu", 250 , 55));
        hm.put(2,new Produto(2,"Sorvete", 3 , 600));
        hm.put(3,new Produto(3,"carrinho", 11 , 300));
        hm.put(4,new Produto(4,"boneca", 120 , 43));
        hm.put(5,new Produto(5,"paçoca", 2 , 555));
        hm.put(6,new Produto(6,"caneta", 5 , 1000));
        hm.put(7,new Produto(7,"calça", 301 , 8));
        hm.put(8,new Produto(8,"camisa", 299 , 64));
        hm.put(9,new Produto(9,"tênis", 433 , 256));
        hm.put(10,new Produto(10,"boné", 32 , 728));
        
    }

    public Produto getProdutoById(int codigo)
    {
        
        return hm.get(codigo);
    }
    
    public HashMap<Integer, Produto> getProdutos()
    {
        
        return hm;
    }



}