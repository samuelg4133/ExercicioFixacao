public class FuncionarioV3 {
        String funcionario;
     String departamento;
     double salario;
     Data data_Entrada;
     String RG;
     boolean ativo;
     
     void bonifica (double aumento){
     this.salario+=salario*(aumento/100);
     }
     
     void demite(){
     this.ativo=false;
     }
     
     void mostrar(){
     System.out.println(this.funcionario);
     System.out.println(this.departamento);
     System.out.println(this.salario);
     System.out.println(data_Entrada.dia+"/"+data_Entrada.mes+"/"+data_Entrada.ano);
     System.out.println(this.RG);
     System.out.println(this.ativo);
     }
}