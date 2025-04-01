package floreria.IoC;

public class Floreria {
	
	private IPedido pedido;

    // Inyectamos de la dependencias en constructor del pedido
	//IoC y DI
	
    public Floreria(IPedido pedido) {
        this.pedido = pedido;
    }

    public void procesarPedido() {
        System.out.println("Procesando pedido de flores.");
        pedido.pagar();
        pedido.entregarPedido();
    }

}
