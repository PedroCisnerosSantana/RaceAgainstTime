package com.ajsb.rat.database;

/**
 * Programación Multimedia y de Dispositivos Móviles
 * Antonio J.Sánchez
 * Race Against Time
 */

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Configuracion.class}, version = 1)
public abstract class ConfigDatabase extends RoomDatabase
{
    public abstract ConfigDAO getConfigDao() ;
}
