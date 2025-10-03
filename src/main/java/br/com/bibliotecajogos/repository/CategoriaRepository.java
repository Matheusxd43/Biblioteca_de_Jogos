package br.com.bibliotecajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecajogos.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}