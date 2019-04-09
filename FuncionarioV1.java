/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
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
