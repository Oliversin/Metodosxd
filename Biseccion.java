
public class Biseccion {

	public double a;
	public double b;
	public double m;
	public double mAnt;
	public double tolerancia;
	public double error;
	public double lado;
	public int iteracion=0;
	
	public Biseccion(double a, double b, double tolerancia) {
		this.a = a;
		this.b = b;
		this.tolerancia = tolerancia;
	}
	
	public void calcularRaiz() {
		
		if(funcion(this.a)*funcion(this.b)>0) {
			System.out.println("No tiene raiz");
		} else {
			do {
				
				this.mAnt = this.m;
				this.m = (this.a+this.b)/2;
				error = Math.abs(m-mAnt)/m;
				lado = funcion(a)*funcion(m);
				
				if(lado<0)
					b = m;
				else
					a=m;
				
				System.out.println("Iteracion: " + iteracion + "  Raiz: " + m + "  Error: " + error);
				
				iteracion++;

			}while(error>=tolerancia);
			
		}
	}
	
	
	
	public double funcion(double x) {
		return (x*x*x)+(4*(x*x))-10;
	}
	
}
