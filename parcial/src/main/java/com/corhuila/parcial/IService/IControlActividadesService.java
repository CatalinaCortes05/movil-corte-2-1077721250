package com.corhuila.parcial.IService;

import com.corhuila.parcial.Entity.ControlActividades;

import java.util.List;
import java.util.Optional;

public interface IControlActividadesService {
    List<ControlActividades> findAll();
    Optional<ControlActividades> findById(Long id);
    ControlActividades save(ControlActividades controlActividades);
    void update(ControlActividades controlActividades, Long id);
    void delete(Long id);
}
