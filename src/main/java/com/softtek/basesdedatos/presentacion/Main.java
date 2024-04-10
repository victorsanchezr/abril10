package com.softtek.basesdedatos.presentacion;

import com.softtek.basesdedatos.persistencia.AccesoProducto;
import com.softtek.basesdedatos.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion con = new Conexion();
        con.abrirConexion();

        AccesoProducto ac = new AccesoProducto();
        System.out.println(ac.obtenerTodos());


        System.out.println(ac.modificar());
        System.out.println(ac.obtenerTodos());

        System.out.println(ac.insertar());
        System.out.println(ac.obtenerTodos());


        System.out.println(ac.borrar());
        System.out.println(ac.obtenerTodos());
    }
}
