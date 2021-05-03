/**
 * 
 */
package br.com.foursys.locadora.contrloller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.dao.FuncionarioDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar o 
 * @author curitiba01
 *
 */
public class FuncionarioController {
	
	
	public void salvar(Funcionario funcionario) {
		
		try {
			
			new FuncionarioDAO().salvar(funcionario);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<Funcionario> buscarPorNome(String nome) {



		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();



		try {
		retorno = new FuncionarioDAO().buscarPorNomes(nome);
		} catch (Exception e) {
		e.printStackTrace();
		}

		return retorno;
		}
	
public void excluir(Funcionario funcionario) {
		
		try {
			
			new FuncionarioDAO().excluir(funcionario);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
