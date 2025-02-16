package com.livros.estudos.service;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.livros.estudos.entity.Livro;

public interface LivroService {
  public List<Livro> listaLivros();

  public Livro listaLivroUnico(@PathVariable(value = "id") long id);

  public Livro salvaLivro(@RequestBody @Validated Livro livro);

  public void excluirLivro(Long id);

  public Livro atualizarLivro(Long id, Livro livro);
}