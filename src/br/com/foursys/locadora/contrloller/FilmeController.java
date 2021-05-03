/**
 * 
 */
package br.com.foursys.locadora.contrloller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.dao.FilmeDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar o 
 * @author curitiba01
 *
 */
public class FilmeController {
	
	
	public void salvar(Filme filme) {
		
		try {
			
			new FilmeDAO().salvar(filme);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<Filme> buscarPorNome(String nome) {



		ArrayList<Filme> retorno = new ArrayList<Filme>();



		try {
		retorno = new FilmeDAO().buscarPorNomes(nome);
		} catch (Exception e) {
		e.printStackTrace();
		}

		return retorno;
		}
	
public void excluir(Filme filme) {
		
		try {
			
			new FilmeDAO().excluir(filme);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
