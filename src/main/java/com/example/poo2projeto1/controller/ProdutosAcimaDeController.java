package com.example.poo2projeto1.controller;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.service.ProdutosAcimaDeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;

@Controller
public class ProdutosAcimaDeController {

    @Autowired
    private ProdutosAcimaDeService ps;
    @GetMapping("/produtosAcimaDe/{valor}")
    public ModelAndView getProdutos(
        @PathVariable("valor") Double valor
        ) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos = ps.getProdutosAcimaDe(valor);
        ModelAndView mv = new ModelAndView("produtosEmEstoqueView");
        mv.addObject("produtos", produtos);
        return mv;
    }
}
