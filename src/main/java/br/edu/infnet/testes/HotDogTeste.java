package br.edu.infnet.testes;

import br.edu.infnet.auxiliar.TipoHotDog;
import br.edu.infnet.modelo.HotDog;
import br.edu.infnet.modelo.Lanche;

public class HotDogTeste {
	public static void main(String[] args) {
		
		
		Lanche lancheHotDogLinguica = new HotDog(1, TipoHotDog.LINGUICA, 2);
		System.out.println(lancheHotDogLinguica.getTipoDeLanche());
		
		
		Lanche lancheHotDogSalsicha = new HotDog(1, TipoHotDog.SALSICHA, 2);
		System.out.println(lancheHotDogSalsicha.getTipoDeLanche());
		
	}
}
