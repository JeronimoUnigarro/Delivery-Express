package com.example.colections;

import com.example.models.pedido;

import java.util.*;

public class ejercicios {

    public static void ejecutar() {
        
        System.out.println("=== Parte A: Listas ===");

       
        List<pedido> pedidosArray = new ArrayList<>();
        pedidosArray.add(new pedido("Pizza", 2, 20));
        pedidosArray.add(new pedido("Hamburguesa", 1, 15));
        pedidosArray.add(new pedido("Perro Caliente", 3, 10));
        pedidosArray.add(new pedido("Sushi", 2, 30));
        pedidosArray.add(new pedido("Empanada", 5, 5));

        System.out.println("Pedidos iniciales (ArrayList): " + pedidosArray);

      
        pedidosArray.add(0, new pedido("Ensalada", 1, 12));
        pedidosArray.add(0, new pedido("Taco", 4, 8));

        System.out.println("Pedidos con urgentes al inicio (ArrayList): " + pedidosArray);

        LinkedList<pedido> pedidosLinked = new LinkedList<>(pedidosArray);
        pedidosLinked.addFirst(new pedido("Sopa", 2, 7));
        pedidosLinked.addFirst(new pedido("Arepa", 3, 6));

        System.out.println("Pedidos con urgentes al inicio (LinkedList): " + pedidosLinked);
        System.out.println("Explicación: Para 1000 pedidos urgentes, LinkedList es más eficiente al insertar al inicio.");

        System.out.println("\n=== Parte B: Conjunto (HashSet) ===");

        HashSet<pedido> pedidosSet = new HashSet<>(pedidosArray);
        pedidosSet.addAll(pedidosArray); 

        System.out.println("Contenido del HashSet (sin duplicados): " + pedidosSet);
        System.out.println("Explicación: HashSet elimina los duplicados automáticamente.");

        System.out.println("\n=== Parte C: Mapas (HashMap) ===");

        Map<String, List<pedido>> pedidosPorCliente = new HashMap<>();

        pedidosPorCliente.put("Carlos", new ArrayList<>(Arrays.asList(
                new pedido("Pizza", 1, 20),
                new pedido("Sushi", 2, 30)
        )));

        pedidosPorCliente.put("Ana", new ArrayList<>(Arrays.asList(
                new pedido("Hamburguesa", 2, 15),
                new pedido("Empanada", 10, 5)
        )));

        pedidosPorCliente.put("Luis", new ArrayList<>(Arrays.asList(
                new pedido("Taco", 3, 8),
                new pedido("Pizza", 2, 20)
        )));

        System.out.println("Pedidos de Ana: " + pedidosPorCliente.get("Ana"));

        for (String cliente : pedidosPorCliente.keySet()) {
            double total = 0;
            for (pedido p : pedidosPorCliente.get(cliente)) {
                total += p.getTotal();
            }
            System.out.println("Total gastado por " + cliente + ": $" + total);
        }

        System.out.println("\n=== Parte D: Genéricos ===");

        List<pedido> todosLosPedidos = new ArrayList<>();
        pedidosPorCliente.values().forEach(todosLosPedidos::addAll);

       
        List<pedido> pizzas = utilidades.filtrar(todosLosPedidos, p -> p.getProducto().equals("Pizza"));
        System.out.println("Pedidos de Pizza: " + pizzas);

       
        List<pedido> mayores50 = utilidades.filtrar(todosLosPedidos, p -> p.getTotal() > 50);
        System.out.println("Pedidos con total > 50: " + mayores50);
    }
}
