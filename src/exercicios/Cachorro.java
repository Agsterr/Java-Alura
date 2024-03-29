package exercicios;

public class Cachorro extends Animal{
      private boolean acaoCachorro ;

      public void estaPerseguindoOrabo(){
          if (acaoCachorro = true){
              System.out.printf("\nesta perseguindo o rabo !!!");
          }else if (acaoCachorro = false){
              System.out.printf("\nNão esta perseguindo o rabo !!!");
          }
      }
    public void emitirSom(){
        System.out.printf("\nSom emitido: " );
        System.out.printf("Latido");
    }



    public void abandonarRabo(boolean acao){
     this.acaoCachorro = acao;
     if(acaoCachorro = true){
         System.out.printf("Cachorro esta perseguindo o rabo !!!");
     } else{
         System.out.printf("O cachorro não esta perseguindo o rabo !!!");

     }

    }

    public void perseguirRabo(){
        acaoCachorro = true;

    }
   public void pararDePerseguirOrabo(){
        acaoCachorro = false;

   }

}
