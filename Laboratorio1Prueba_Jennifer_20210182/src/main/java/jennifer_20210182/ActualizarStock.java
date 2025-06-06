package jennifer_20210182;

import java.util.Map;
import java.util.TreeMap;

public class ActualizarStock {

    public void Actualizar_Stock() {
        /*Se realiza el uso de treeMap*/
        TreeMap<Integer, Integer> producto = new TreeMap<>();

        //Se ingresan los productos
        producto.put(1, 4);
        producto.put(2, 8);
        producto.put(3, 4);

        //Por medio de un bucle va a buscar el ID del producto por medio del arreglo
        for (Map.Entry<Integer, Integer> entrada : producto.entrySet()) {
            System.out.println("Existencia del producto: " + producto.containsKey(1));
            System.out.println("Id: " + entrada.getKey() + "Cantidad: " + entrada.getValue());
        }

       /*
        if (producto === true){
            producto[] =Object nueva_cantidad;
        }
        else
        {

        }
    }
*/
    }
}
