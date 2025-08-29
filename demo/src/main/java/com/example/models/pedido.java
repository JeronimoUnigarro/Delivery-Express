package com.example.models;

public class pedido {
    private String producto;
    private int cantidad;
    private double precio;

    public pedido(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", total=" + getTotal() +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof pedido)) return false;
        pedido p = (pedido) o;
        return producto.equals(p.producto) && cantidad == p.cantidad && precio == p.precio;
    }

    @Override
    public int hashCode() {
        return producto.hashCode() + cantidad * 31 + (int) precio * 17;
    }
}
