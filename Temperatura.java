public class Temperatura {
    
double ConverterParaCelsius(double F){
    
    double RC;
    RC = ((F-32.0)*(5.0/9.0));
    return RC;
}

double ConverterParaFarenheit(double C){
    
    double RF;
    RF = (C*(9.0/5.0)+32.0);
    return RF;
}

}
