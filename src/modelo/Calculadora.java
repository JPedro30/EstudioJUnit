package modelo;

public class Calculadora {
    
	private int mr;

	public Calculadora() {
		mr = 0;
	}

	public int suma(int a, int b) {
		mr = a + b;
		return mr;
	}

	public int resta(int a, int b) {
		mr = a - b;
		return mr;

	}

	public int suma(int v) {
		mr += v;
		return mr;
	}

	public double suma(double a, double b) {

		return a + b;

	}

	public int resta(int v) {
		mr -= v;
		return mr;
	}
	
	 public int mr() {

	        return mr;
	    }
	 
	 public int div(int a, int b) {
	        
	        if(b==0)
	            throw new ArithmeticException("No puedes dividir por cero");
	        mr = a / b;
	        return mr;

	    }
	 public void operacionOptima(){
	        try {
	            // es una operacion que no debe tardar mas de 1 sg

	            Thread.sleep(1000);
	        } catch (InterruptedException ex) {
	            System.out.println("Operacion interrumpida");
	        }
	    
	    }
	 
// end class
}
