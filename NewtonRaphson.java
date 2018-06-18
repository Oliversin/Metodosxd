
public class NewtonRaphson {

	public double xn;
	public double xnAnt;
	public int iteracion=0;
	public double error;
	public double tolerancia;
	
	public NewtonRaphson(double xn,double tolerancia) {
		this.xn = xn;
	}
	
	public double funcion(double x) {
		return (x*x*x)-(3*x)+1;
	}
	
	public double derivadaF(double x) {
		return (3*x*x)-3;
	}
	
	public void calcularRaiz() {
		do {
			xnAnt = xn;
			xn =  xn - (funcion(xn)  / derivadaF(xn));
			error = Math.abs(xn-xnAnt)/xn;
			System.out.println("Iteracion: " + iteracion + "  Raiz: " + xn + "  Error: " + error);

			iteracion++;
		}while(error>tolerancia);
	}
	
}
