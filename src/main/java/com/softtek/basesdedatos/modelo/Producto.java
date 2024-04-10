package com.softtek.basesdedatos.modelo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {


    private int idProducto;

    private String nombreProducto;

    private double precioUnitario;

    private int unidadesStock;
//borrar modificar insertar CRUD
    @Override
    public String toString() {
        return "\nProducto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                '}';
    }
}
