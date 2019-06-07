import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;

public class TesteCep {
public static void main(String[] args) {
		
		Formatar fmt = new FormatarString();
		
		String cep = "79645406";
		String maskCep = "#####-###";
		
		System.out.println(fmt.cep(cep, maskCep));
		
	}

}
