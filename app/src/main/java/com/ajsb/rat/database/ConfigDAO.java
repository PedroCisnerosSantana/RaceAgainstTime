package com.ajsb.rat.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Programación Multimedia y de Dispositivos Móviles
 * Antonio J.Sánchez
 * Race Against Time
 */

@Dao
public interface ConfigDAO
{
    @Query("SELECT * FROM configuracion")
    public List<Configuracion> getAll() ;  // Devuelve todos los registros de la base de datos.

    @Query("SELECT * FROM configuracion WHERE id = :idc")
    public Configuracion find(int idc) ;    // Devuelve el registro de la tabla configuración con id

    @Insert
    public void insertConfig(Configuracion... config) ;

    @Delete
    public void deleteConfig(Configuracion... config) ;

    @Update
    public void updateConfig(Configuracion... config) ;
}
