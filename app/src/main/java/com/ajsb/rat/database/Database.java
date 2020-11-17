package com.ajsb.rat.database;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

/**
 * Programación Multimedia y de Dispositivos Móviles
 * Antonio J.Sánchez
 * Race Against Time
 */

public class Database
{
    private static Database instancia = null ;
    private ConfigDAO configDAO ;

    private Database(Context context)
    {
        ConfigDatabase db = Room.databaseBuilder(context, ConfigDatabase.class, "rat")
                                .allowMainThreadQueries()
                                .build() ;
        //
        configDAO = db.getConfigDao() ;
    }

    /**
     * Utilizamos patrón Singleton.
     * El método crea la instancia, si no existe, y la devuelve.
     * @return
     */
    public static Database getInstancia(Context context)
    {
        if (instancia == null) instancia = new Database(context) ;
        return instancia ;
    }

    /**
     * @return
     */
    public ConfigDAO getDao()
    {
        return configDAO ;
    }

    /**
     * Devuelve una Lista con tantos objetos de tipo Configuración como registros
     * contenga dicha tabla en la base de datos.
     * @return
     */
    /*public List<Configuracion> dameloTodo()
    {
        return configDAO.getAll() ;
    }*/

    /**
     * @param config
     */
    /*public void save(Configuracion... config)
    {
        configDAO.insertConfig(config) ;
    }*/

    /**
     * @param config
     */
    /*public void delete(Configuracion... config)
    {
        configDAO.deleteConfig(config) ;
    }*/

}
