package com.gitrub.tiberiocoelho.RestAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.gitrub.tiberiocoelho.RestAPI.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
