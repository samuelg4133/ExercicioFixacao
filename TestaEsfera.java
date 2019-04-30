public class TestaEsfera {
    
    public static void main(String[] args) {
        
        Esfera E1 = new Esfera();
        
        E1.Raio = 2;
        E1.CalcularVolume();
        
        System.out.println("Volume: " + E1.Volume);
        
    }
    
}