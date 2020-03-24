package com.example.poo2projeto1.controller;

import com.example.poo2projeto1.model.Produto;
import com.example.poo2projeto1.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService ps;
    @GetMapping("/produto/{codigo}")
    public ModelAndView getProduto(
        @PathVariable("codigo") String codstring
        ) {
            int codigo = Integer.parseInt(codstring);
            
        ModelAndView mv = new ModelAndView("produtoView");
        
        Produto produto = ps.getProdutoById(codigo);
                if (produto ==null)
        {
            mv = new ModelAndView("helloView");
            return mv;
        }
        
        mv.addObject("produto", produto);

        return mv;
    }
}
