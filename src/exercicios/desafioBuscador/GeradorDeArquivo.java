package exercicios.desafioBuscador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {
    public void salvaEndereco(List<Endereco> listaDeEndereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fileWriter = new FileWriter("listaDeEndereço.json")) {
            fileWriter.write(gson.toJson(listaDeEndereco));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
