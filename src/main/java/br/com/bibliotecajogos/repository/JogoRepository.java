package br.com.bibliotecajogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecajogos.entity.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

    List<Jogo> findByTituloContainingIgnoreCase(String titulo);

    List<Jogo> findByAutorContainingIgnoreCase(String autor);

    List<Jogo> findByGeneroContainingIgnoreCase(String genero);
}
