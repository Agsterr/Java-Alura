package exercicios.ExerComclasserecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalPessoa {
    public static void main(String[] args) {

        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();


                                     //arquivo    Classe pessoa
        Pessoa pessoa = gson.fromJson(json , Pessoa.class);

        System.out.println(pessoa);
    }
}
