
public class Main {

	public static void main(String[] args) {
		Corredor sujeto1 = new Corredor(10);
	    Corredor sujeto2 = new Corredor(30);
	    
	    
	       
	    sujeto1.verificarEnergia();
	    sujeto1.recargarEnergia(120);
	    sujeto1.verificarEnergia();
	    sujeto1.entrenar();
	    sujeto1.verificarEnergia();
	    //System.out.println(sujeto1.verificarEnergia());
	       
		sujeto2.verificarEnergia();
	    sujeto2.recargarEnergia(20);
	    sujeto2.verificarEnergia();
	    sujeto2.entrenar();
	    sujeto2.verificarEnergia();
	    //System.out.println(sujeto2.verificarEnergia());	    
	}

}
