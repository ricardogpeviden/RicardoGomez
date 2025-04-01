package floreria.IoC;

public class Main {

	public static void main(String[] args) {
		
		// inyeccion de la dependencia de IPedido
		
        IPedido pedido = new PedidoLocalEfectivo();

        // Inyectamos la dependencia de floreria
        
        Floreria floreria = new Floreria(pedido);
        floreria.procesarPedido();

	}

}
