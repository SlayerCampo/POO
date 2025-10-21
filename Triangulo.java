public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(String color, double base, double altura) {
        super("Triángulo", color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        // Para simplificar, asumimos triángulo isósceles
        double lado = Math.sqrt((base/2)*(base/2) + altura*altura);
        return base + (2 * lado);
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("TRIÁNGULO | Color: " + color + 
    "  Base: " + base + "  Altura: " + altura +
    "  Área: " + String.format("%.2f", calcularArea()) +
    "  Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
}