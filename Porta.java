public class Porta {
    
    boolean Aberta;
    String Cor;
    double DimensaoX;
    double DimensaoY;
    double DimensaoZ;

void Abre(){
    Aberta = true;
}   

void Fecha(){
    Aberta = false;
}

void Pinta(String New_Cor){
    
    Cor = New_Cor;
    
}

void Dimensao(double X, double Y, double Z){
    
    DimensaoX = X;
    DimensaoY = Y;
    DimensaoZ = Z;
}

boolean EstaAberta(){
    
    if (Aberta == true)
        return true;
    else
        return false;
}

}
