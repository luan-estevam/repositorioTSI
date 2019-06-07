import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;

public class TesteCnpj {
	
	public static void main(String[] args) {
		
		Formatar fmt = new FormatarString();
		
		String cnpj = "77637684000066";
		String maskCnpj = "##.###.###/####-##";
		
		System.out.println(fmt.cnpj(cnpj, maskCnpj));
		
	}

}
