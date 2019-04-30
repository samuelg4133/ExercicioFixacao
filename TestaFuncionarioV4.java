public class TestaFuncionarioV4 {
    
    public static void main(String[] args) {
        
        FuncionarioV4 V1 = new FuncionarioV4();
        V1.funcionario = "Rafael";
        V1.departamento = "TI";
        V1.RG = "M0001112";
        V1.salario = 1000.0;
        V1.ativo =  true;
        
        Data D1 = new Data();
        D1.dia = 10;
        D1.mes = 9;
        D1.ano = 2000;
        
        V1.data_Entrada = D1;
        
        V1.bonifica(20);
        V1.demite();
        V1.mostrar();
        System.out.println("");
        
        FuncionarioV4 V2 = new FuncionarioV4();
        V2.funcionario = "Rafael";
        V2.departamento = "TI";
        V2.RG = "M0001112";
        V2.salario = 1000.0;
        V2.ativo =  true;
        
        Data D2 = new Data();
        D2.dia = 10;
        D2.mes = 9;
        D2.ano = 2000;
        
        V2.data_Entrada = D2;
        
        V2.bonifica(20);
        V2.demite();
        V2.mostrar();
        
        V1.equals(V2);
        
    }   
}