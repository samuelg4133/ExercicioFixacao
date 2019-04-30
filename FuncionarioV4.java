public class FuncionarioV4 {
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
     
     void equals(FuncionarioV4 f){
  if((this.funcionario == f.funcionario) && (this.departamento == f.departamento) && 
            (this.salario == f.salario) && (this.RG == f.RG) && (this.ativo == f.ativo) && 
            (this.data_Entrada.dia+this.data_Entrada.mes+this.data_Entrada.ano == f.data_Entrada.dia+f.data_Entrada.mes+f.data_Entrada.ano))
        
        System.out.println("São Iguais");
    
    else
        
        System.out.println("Não são iguais");   
     
     
     }
}