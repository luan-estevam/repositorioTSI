package br.cinema.model;

public class FormatarString implements Formatar {

	public String cpf(String num, String mascara) {

		/*
		 * @param num contendo a string a ser formatada
		 * 
		 * @param mascara que exibira a string formatada ex: ###.###.###-##
		 * 
		 */


		if (num.length() == 11) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();

				for (int i = 0; i < mascara.length(); i++) {
					char numAtual = mascara.charAt(i); // pesquisar principais metodos da classe string
					if (numAtual == '#') {
						numFormatado.append(num.charAt(index));
						index++;
					} else {
						numFormatado.append(numAtual);
					}

				}
				return numFormatado.toString();
			} else {
				return "CPF inválido";

			}

		}
		return "CPF inválido";
	}

	@Override
	public boolean validCPF(String num) {
		boolean validcpf = false;

		if (num.charAt(0) == num.charAt(1) && (num.charAt(1) == num.charAt(2))) {

			int soma = 0;

			int n = 10;
			for (int i = 0; i < num.length() - 2; i++) {
				soma = soma + Integer.parseInt("" + num.charAt(i)) * n;
				n--;
			}

			// pegar o resto da divisao % = mod
			// n = 11
			// num.length() - 1

			validcpf = true;

		}
		return validcpf = true;
	}

	@Override
	public String cnpj(String num, String mascara) {
		// TODO Auto-generated method stub

		

		if (num.length() == 14) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();
			

			for (int i = 0; i < mascara.length(); i++) {
				char numAtual = mascara.charAt(i); // pesquisar principais metodos da classe string
				if (numAtual == '#') {
					numFormatado.append(num.charAt(index));
					index++;
				} else {
					numFormatado.append(numAtual);
				}

			}
			return numFormatado.toString();

		} else {
			return "Cnpj inválido";

		}
	}
		return "Cnpj inválido";
}

	@Override
	public String fone(String num, String mascara) {
		// TODO Auto-generated method stub

		if (num.length() == 13) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();
			

			for (int i = 0; i < mascara.length(); i++) {
				char numAtual = mascara.charAt(i); // pesquisar principais metodos da classe string
				if (numAtual == '#') {
					numFormatado.append(num.charAt(index));
					index++;
				} else {
					numFormatado.append(numAtual);
				}

			}
			return numFormatado.toString();

		} else {
			return "Fone inválido";

		}
	}
		return "Fone inválido";
	}

	@Override
	public String cep(String num, String mascara) {
		
	
		if (num.length() == 8) {
			if (this.validCPF(num)) {
				int index = 0;
				StringBuilder numFormatado = new StringBuilder();
			

			for (int i = 0; i < mascara.length(); i++) {
				char numAtual = mascara.charAt(i); // pesquisar principais metodos da classe string
				if (numAtual == '#') {
					numFormatado.append(num.charAt(index));
					index++;
					} else {
					numFormatado.append(numAtual);
					}

				}
			return numFormatado.toString();

			} else {
			return "Cep inválido";

			}
		}
			return "Cep inválido";

	}
}
