import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;

public class TesteFone {
	
	public static void main(String[] args) {
		
		Formatar fmt = new FormatarString();
		
		String fone = "5567996907542";
		String maskCnpj = "+##(##)#####-####";
		
		System.out.println(fmt.fone(fone, maskCnpj));
		
	}


}
