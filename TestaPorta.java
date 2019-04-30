public class TestaPorta {
    
    public static void main(String[] args) {
        
        Porta P1 = new Porta();
        P1.Aberta = false;
        P1.Cor = "Vermelha";
        P1.DimensaoX = 82.0;
        P1.DimensaoY = 210.0;
        P1.DimensaoZ = 3.0;
        
        P1.Pinta("Azul");
        P1.Pinta("Preto");
        P1.Pinta("Roxo");
        
        P1.Dimensao(83.0, 211.0, 3.5);
        P1.Dimensao(84.0, 212.0, 3.6);
        P1.Dimensao(85.0, 213.0, 3.7);
        
        P1.Abre();
        P1.Fecha();
        
        System.out.println("Porta Aberta:" + P1.EstaAberta());
        System.out.println("Cor:" + P1.Cor);
        System.out.println("Dimensão: " + P1.DimensaoX + "," + P1.DimensaoY + "," + P1.DimensaoZ );
    }
}
