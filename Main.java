
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Secante b = new Secante(3.0, 1.0, 0.0001 );
		//NewtonRaphson b = new NewtonRaphson(2.0, 0.0001);
		//FalsaPosicion b = new FalsaPosicion(1.0, 2.0, 0.0001);
		//Biseccion b = new Biseccion(1.0,1.5,0.0001);
		b.calcularRaiz();
	}

}
