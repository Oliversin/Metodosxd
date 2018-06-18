
public class Secante {

	public double xn0;
	public double xn;
	public double xn1;
	public double xnAnt;
	public int iteracion=0;
	public double error;
	public double tolerancia;
	
	public Secante(double xn, double xn0, double tolerancia) {
		this.xn = xn;
		this.xn0 = xn0;
		this.tolerancia = tolerancia;
	}
	
	public void calcularRaiz() {
		do {
			
			xnAnt = xn;
			xn = xn - ( (funcion(xn)*(xn0-xn)) / ( funcion(xn0)-funcion(xn) ) ); 
			error = Math.abs((xn-xnAnt)/xn);
			System.out.println("Iteracion: " + iteracion + "  Raiz: " + xn + "  Error: " + error);
			iteracion++;
		}while(error>tolerancia);
	}
	
	public double funcion(double x) {
		return (x*x*x*x*x)+(7*x)-6;
	}
	
}
