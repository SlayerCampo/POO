public class Figura {
    protected String nombre;
    protected String color;
    
    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public double calcularArea() {
        return 0; 
    
    }   
    
    public double calcularPerimetro() {
        return 0; 
    }
    
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre + "  Color: " + color);
    }
}