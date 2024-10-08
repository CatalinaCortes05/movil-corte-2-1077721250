package com.corhuila.parcial.IRepository;

import com.corhuila.parcial.Entity.ControlActividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IControlActividadesRepository extends JpaRepository<ControlActividades, Long> {
}
