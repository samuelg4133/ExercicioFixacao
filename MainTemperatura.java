public class MainTemperatura {
    
    public static void main(String[] args) {
       
    Temperatura T1 = new Temperatura();
    
    double RC = 50.0;
    T1.ConverterParaCelsius(RC);
    
    double RF = 10.0;
    T1.ConverterParaFarenheit(RF);
      
    System.out.println(RC + " Graus Farenheite é igual a: "+ T1.ConverterParaCelsius(RC) + " Graus Celsius");
    
     System.out.println(RF + " Graus Celsius é igual a: "+ T1.ConverterParaFarenheit(RF) + " Graus Farenheite");
     
    }
    
}
