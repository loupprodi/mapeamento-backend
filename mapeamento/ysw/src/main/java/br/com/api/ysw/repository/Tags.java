package br.com.api.ysw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.ysw.model.Tag;

public interface Tags extends JpaRepository<Tag,Integer> {
  
}
