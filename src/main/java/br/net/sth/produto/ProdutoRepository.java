package br.net.sth.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAll();
    List<Produto> findByDescricaoLike(String descricao);
}
