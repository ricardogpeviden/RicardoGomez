package floreria.IoC;

public class PedidoLocalEfectivo implements IPedido {
	
	//Implementacion de los metodos de la interfaz con pago en efectivo
	
	@Override
    public void pagar() {
        System.out.println("Pago en efectivo realizado.");
    }
    
    @Override
    public void entregarPedido() {
        System.out.println("Entrega local del pedido realizada.");
    }

}
