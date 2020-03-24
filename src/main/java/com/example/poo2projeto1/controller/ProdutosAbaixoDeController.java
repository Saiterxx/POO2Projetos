package com.example.poo2projeto1.controller;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.service.ProdutosAbaixoDeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;

@Controller
public class ProdutosAbaixoDeController {

    @Autowired
    private ProdutosAbaixoDeService ps;
    @GetMapping("/produtosAbaixoDe/{valor}")
    public ModelAndView getProdutos(
        @PathVariable("valor") Double valor
        ) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos = ps.getProdutosAbaixoDe(valor);
        ModelAndView mv = new ModelAndView("produtosEmEstoqueView");
        mv.addObject("produtos", produtos);
        return mv;
    }
}
