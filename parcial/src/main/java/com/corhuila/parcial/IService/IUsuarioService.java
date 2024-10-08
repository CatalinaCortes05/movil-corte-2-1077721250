package com.corhuila.parcial.IService;

import com.corhuila.parcial.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void update(Usuario usuario, Long id);
    void delete(Long id);
}
