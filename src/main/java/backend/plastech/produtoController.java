package backend.plastech;

import Objetos.bobinaRepositorio;
import Objetos.bobinas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import produtos.DadosProdutos;

@RestController
@RequestMapping("/produtos")
@FlywayDataSource
public class produtoController {

    @Autowired(required = false)
    private bobinaRepositorio repository;
    @PostMapping
    public void cadastrar(@RequestBody DadosProdutos dados){
        repository.save(new bobinas(dados));
    }
}
