package com.example.poo2projeto1.controller;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.service.ProdutosEmEstoqueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;

@Controller
public class ProdutosEmEstoqueController {

    @Autowired
    private ProdutosEmEstoqueService ps;
    @GetMapping("/produtosEmEstoque")
    public ModelAndView getProdutos(
        ) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos = ps.getProdutosEmEstoque();
        ModelAndView mv = new ModelAndView("produtosEmEstoqueView");
        mv.addObject("produtos", produtos);
        return mv;
    }


}
