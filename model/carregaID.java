import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public static class carregaID{

	public static final String path = "..\\data\\qtdProdutos.txt";

	public static int carregar(){
		int qtd 
		try{
			BufferedReader br = new BufferedReader(new FileReader(path));
			Integer.parseInt(br.readLine());

		}catch(IOException e){
			System.out.println("Erro ao abrir o arquivo");
			qtd = -1;
		}finally{
			br.close();
		}

		return qtd;

	}

}