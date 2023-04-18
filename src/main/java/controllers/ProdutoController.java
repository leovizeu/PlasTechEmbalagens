package controllers;

import org.springframework.web.bind.annotation.*;
import produtos.DadosProdutos;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosProdutos dados){

        System.out.println(dados);
    }
}
