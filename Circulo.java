public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String color, double radio) {
        super("Círculo", color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("● CÍRCULO | Color: " + color + 
    "  Radio: " + radio + 
    "  Área: " + String.format("%.2f", calcularArea()) +
    "  Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
}