package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaNome {

	public static void main(String[] args) {
		
		// . -> qualquer coisa
		// a -> casa com a
		// Z -> casa com Z
		// 0 -> casa com 0
		// * -> greedy -> casa 0 ou mais vezes
		// + -> greedy -> casa 1 ou mais vezes
		// [^A] -> N�o A
		// [A] -> A
		// [a-zA-Z] -> casa com qualquer caracter entre a a z ou A a Z
		// \s -> espa�os em branco
		// () -> define grupo de captura
		// ? -> uma vez ou n�o
		// | -> OU
		

		// Valida��o de e-mail!!
		// letras, numeros, underline, tra�o, pontos + arroba + dominio (letras e numeros) . (letras) [. (letras opcional)]

		// Tem que ter um @
		// n�o pode ter espa�o em branco
		// tem que ter pelo menos um .
		// depois do arroba vem informa��o do dom�nio (letras e numeros)
		// tem que ter apenas UM @
		// N�o pode caracteres especiais
		// letras, numeros e pontos <- antes do arroba

		
		Pattern padrao = Pattern.compile("([a-zA-Z]|[0-9]|_|-|\\.)+" // antes do arroba -> qualquer coisa dentro da regra 1 ou + vezes
				+ "@" // arroba
				+ "([a-zA-Z]|[0-9])+" // qualquer coisa alfanumerica uma ou mais vezes
				+ "\\." // ponto
				+ "([a-zA-Z]|[0-9])+" // qualquer coisa alfanumerica uma ou mais vezes
				+ "(\\.([a-zA-Z]|[0-9])+)*"); // .qualquercoisa 0 ou mais vezes
		Matcher matcher = padrao.matcher("theo_lomeu.braga@sc.estudante.sesisenai.org.br");
		System.out.println(matcher.matches());

		// Validar n�mero de telefone
		// '+' + ddi (entre 1 at� 3 caracteres) + ddd (at� tr�s caracteres) + de 3 a 5 caracteres + '-' + 4 caracteres 
		// +552198888-0000
//		
		Pattern padrao2 = Pattern.compile("(\\+[0-9]{2})([0-9]{2})([0-9]{3,5})-([0-9]{4})");
		Matcher matcher2 = padrao2.matcher("+552198888-0000");
		System.out.println(matcher2.matches());
		System.out.println(matcher2.groupCount());
		System.out.println(matcher2.group(0));
		System.out.println(matcher2.group(1));
		System.out.println(matcher2.group(2));
		System.out.println(matcher2.group(3));
		System.out.println(matcher2.group(4));
	}
	
}
