package EqualsHashcode;

public class Usuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
		Usuario outro = (Usuario)objeto;	
		
		boolean nomeIgual = (outro.nome == this.nome);
		boolean emailIgual = (outro.email == this.email);
		boolean resultado = (nomeIgual && emailIgual);
		return resultado;		
		}else {
			return false;
		}
		// O Hashcode sera abordado em outra aula.
	}
}
