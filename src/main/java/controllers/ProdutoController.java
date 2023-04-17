package controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Produtos")
public class ProdutoController {
    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }
}
