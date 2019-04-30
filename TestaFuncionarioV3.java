public class TestaFuncionarioV3 {
    public static void main(String[] args){
    FuncionarioV3 f3 = new FuncionarioV3();
    Data dt = new Data();
    
    dt.dia=1;
    dt.mes=8;
    dt.ano=2018;
    
    f3.RG="MG-153.162-17";
    f3.ativo=true;
    f3.data_Entrada=dt;
    f3.departamento="Negócios";
    f3.funcionario="Samuel Gomes Vieira";
    f3.salario=1297.95;
    
    f3.mostrar();
            }
}