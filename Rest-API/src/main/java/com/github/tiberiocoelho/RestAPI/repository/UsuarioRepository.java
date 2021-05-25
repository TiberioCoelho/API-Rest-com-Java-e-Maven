package com.github.tiberiocoelho.RestAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.github.tiberiocoelho.RestAPI.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
