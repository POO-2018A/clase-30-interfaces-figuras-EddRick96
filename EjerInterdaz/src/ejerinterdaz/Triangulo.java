/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerinterdaz;

/**
 *
 * @author Erick
 */
public class Triangulo implements Figura{
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo(double lado1, double lado2, double lado3, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
            
    @Override
    public double calcularPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
    @Override
    public double calcularArea(){
        System.out.println("Área no disponible.");
        return 0;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    @Override
    public String toString() {
        return "Perimetro: " + calcularPerimetro() +"\n"
                +"Area:"+ calcularArea() ;
    }
}
