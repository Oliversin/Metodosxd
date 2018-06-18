
public class FalsaPosicion {

	public double a;
	public double b;
	public double xr;
	public double xrAnt;
	public double tolerancia;
	public double error;
	public double lado;
	public int iteracion = 0;

	public FalsaPosicion(double a, double b, double tolerancia) {
		this.a = a;
		this.b = b;
		this.tolerancia = tolerancia;
	}

	public void calcularRaiz() {

		if (funcion(this.a) * funcion(this.b) > 0) {
			System.out.println("No tiene raiz");
		} else {
			do {
				
				
				
				this.xrAnt = this.xr;
				this.xr = a - ( (funcion(a)*(b-a) ) / (  funcion(b)-funcion(a) ) );
				error = Math.abs(xr - xrAnt) / xr;
				lado = funcion(a) * funcion(xr);
				
				if (lado < 0)
					b = xr;
				else
					a = xr;

				System.out.println("Iteracion: " + iteracion + "  Raiz: " + xr + "  Error: " + error);

				iteracion++;

			} while (error >= tolerancia);

		}
	}

	public double funcion(double x) {
		return (x * x * x) - (3 * x) + 1;
	}
}
