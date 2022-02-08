
package ejercicio9;

/**
 *
 * @author dark_
 */
public class Matematicas {
    //////////////////////////Atributes///////////////////////////////////////
    
    private double a;
    private double b;
    /////////////////////////Builders//////////////////////////////////////////

    public Matematicas(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Matematicas() {
    }

   ////////////////////////////Getters and Setters///////////////////////////

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    ////////////////////////////////Methods//////////////////////////////////
     public double devolverMayor() {
        
        return Math.max(this.a, this.b);
        
    }
    
    public void calcularPotencia() {
        
       double c = Math.round(devolverMayor()) ;
       double d = Math.round(Math.min(this.a, this.b));
       
        System.out.printf("La potencia es %f\n",Math.pow(this.a, this.b));
    }
    
    public void calcularRaiz() {
        
       double c = Math.abs(this.a);
       double d = Math.abs(this.b);
       
        System.out.printf("La raiz cuadrada del menor numero es %f\n", Math.sqrt(Math.min(this.a, this.b)));
       
    }
}
