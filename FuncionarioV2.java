/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class FuncionarioV2 {
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
     
     void mostrar(){
     System.out.println(this.funcionario);
     System.out.println(this.departamento);
     System.out.println(this.salario);
     System.out.println(this.data_Entrada);
     System.out.println(this.RG);
     System.out.println(this.ativo);
     }
     
     
}
