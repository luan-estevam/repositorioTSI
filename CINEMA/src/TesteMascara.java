import br.cinema.model.Formatar;
import br.cinema.model.FormatarString;

public class TesteMascara {
	
	public static void main(String[] args) {
		
		Formatar fmt = new FormatarString();
		
		String cpf = "12356708001";
		String maskCpf = "###.###.###-##";
		
		System.out.println(fmt.cpf(cpf, maskCpf));
		
	}

}
