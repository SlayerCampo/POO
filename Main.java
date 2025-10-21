public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");
        
        
        Figura[] figuras = {
            new Circulo("Rojo", 5.0),
            new Cuadrado("Azul", 4.0),
            new Triangulo("Verde", 6.0, 4.0),
            new Circulo("Amarillo", 3.0),
            new Cuadrado("Naranja", 7.0)
        };
        
    
        
        System.out.println("\n=== CÁLCULOS ESPECÍFICOS ===");
        for (Figura figura : figuras) {
            double area = figura.calcularArea();
            double perimetro = figura.calcularPerimetro();
            System.out.println(figura.nombre + " " + figura.color + 
                             "  Área: " + String.format("%.2f", area) + 
                             "  Perímetro: " + String.format("%.2f", perimetro));
        }
        
        System.out.println("\n=== TOTALES ===");
        double areaTotal = 0;
        double perimetroTotal = 0;
        
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
            perimetroTotal += figura.calcularPerimetro();
        }
        
        System.out.println("Área total de todas las figuras: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro total de todas las figuras: " + String.format("%.2f", perimetroTotal));
    }
}