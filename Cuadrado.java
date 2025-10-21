public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(String color, double lado) {
        super("Cuadrado", color);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("CUADRADO | Color: " + color + 
        " Lado: " + lado + 
        " Área: " + String.format("%.2f", calcularArea()) +
        " Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
}