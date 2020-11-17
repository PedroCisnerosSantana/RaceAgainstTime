package com.ajsb.rat.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Programación Multimedia y de Dispositivos Móviles
 * Antonio J.Sánchez
 * Race Against Time
 */

@Entity(tableName = "configuracion")
public class Configuracion
{
    @PrimaryKey(autoGenerate = true)
    private int id ;

    @ColumnInfo(name = "limite")
    private int limite ;

    @ColumnInfo(name = "puntos")
    private int puntuacion ;

    public Configuracion(int limite, int puntuacion)
    {
        this.limite = limite;
        this.puntuacion = puntuacion;
    }

    /**
     * @return
     */
    public int getId()
    {
        return id ;
    }

    /**
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return
     */
    public int getLimite()
    {
        return limite;
    }

    /**
     * @param limite
     */
    public void setLimite(int limite)
    {
        this.limite = limite;
    }

    /**
     * @return
     */
    public int getPuntuacion()
    {
        return puntuacion;
    }

    /**
     * @param puntuacion
     */
    public void setPuntuacion(int puntuacion)
    {
        this.puntuacion = puntuacion;
    }
}
