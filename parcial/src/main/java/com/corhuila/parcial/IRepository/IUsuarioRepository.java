package com.corhuila.parcial.IRepository;

import com.corhuila.parcial.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
