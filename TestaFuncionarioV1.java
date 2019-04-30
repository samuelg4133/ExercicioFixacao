public class TestaFuncionarioV1 {
    public static void main(String[] args){
     FuncionarioV1 f1 = new FuncionarioV1();
    
     
     f1.salario=1000;
     f1.ativo=true;
     f1.bonifica(0.01);
     f1.demite();
     
     System.out.println(f1.salario);
      System.out.println(f1.ativo);
     }
}