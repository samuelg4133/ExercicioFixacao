public class FuncionarioV1 {
     String funcionario;
     String departamento;
     double salario;
     String data_Entrada;
     String RG;
     boolean ativo;
     
     void bonifica (double aumento){
     this.salario+=salario*(aumento/100);
     }
     
     void demite(){
     this.ativo=false;
     }
}