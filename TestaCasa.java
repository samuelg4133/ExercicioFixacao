public class TestaCasa {
    
    public static void main(String[] args) {
              
        Casa C1 = new Casa();
        
        C1.Cor = "Branca";
        C1.Porta1 = true;
        C1.Porta2 = false;
        C1.Porta3 = true;
        
        System.out.println("Portas Abertas: " + C1.QuantasPortasEstaoAbertas());
    }
    
}