package edu.dosw.lab.Comportamentales.reto1;

class ClienteFactory {
    public static Client crearCliente(String tipo) {
        switch (tipo.toLowerCase()) {
            case "nuevo":
                return new Client("Nuevo", new NewCustomerDiscount());
            case "frecuente":
                return new Client("Frecuente", new FrequentCustomerDiscount());
            default:
                throw new IllegalArgumentException("Tipo de cliente no soportado");
        }
    }
}

// 4. Carrito de compras
