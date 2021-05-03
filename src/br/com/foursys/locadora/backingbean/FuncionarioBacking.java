/**
 * 
 */
package br.com.foursys.locadora.backingbean;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.contrloller.FuncionarioController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Valida;

/**
 * @author curitiba01
 *
 */
public class FuncionarioBacking {
	
	
	// atributos da tela de cadastro
	
	private String nome;
	private String cpf;
	private String rg;
	private String data_nascimento;
	private String idade;
	private String sexo;
	private String login;
	private String senha;
	private String perfil;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String telefone;
	private String celular;
	private String email;
	private String cidade;
	private String estado;
	
	
	// atributos da tela de consulta
		private String nomePesquisar;
		private Filme funcionarioSelecionado;

		// atributos auxiliares
		private Funcionario funcionario;
		private Contato contato;
		private Endereco enderecos;
		
		
		
		private ArrayList<Funcionario> listaFuncionarios;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getData_nascimento() {
			return data_nascimento;
		}
		public void setData_nascimento(String data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getPerfil() {
			return perfil;
		}
		public void setPerfil(String perfil) {
			this.perfil = perfil;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCelular() {
			return celular;
		}
		public void setCelular(String celular) {
			this.celular = celular;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getNomePesquisar() {
			return nomePesquisar;
		}
		public void setNomePesquisar(String nomePesquisar) {
			this.nomePesquisar = nomePesquisar;
		}
		public Filme getFuncionarioSelecionado() {
			return funcionarioSelecionado;
		}
		public void setFuncionarioSelecionado(Filme funcionarioSelecionado) {
			this.funcionarioSelecionado = funcionarioSelecionado;
		}
		public Funcionario getFuncionario() {
			return funcionario;
		}
		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}
		public ArrayList<Funcionario> getListaFuncionarios() {
			return listaFuncionarios;
		}
		public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
			this.listaFuncionarios = listaFuncionarios;
		}
		
		

		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		/*
		 * método para abrir a tela de cadastro funcionario
		 */
		public String cadastroFuncionario() {
			
			return "";
		}
		/*
		 * método que captura a ação do botão SAIR
		 */
		public String sair() {
			return "sair";
		}
		
		/*
		 * método que captura a ação do botão CANCELAR 
		 */
		public void cancelar() {

		}
		
		/*
		 * método que captura a ação do botão CADASTRAR na tela cad-funcionario.jsp
		 */
		public void cadastrar() {

			if (validar()) {

				try {
					get_Funcionario();
					new FuncionarioController().salvar(funcionario);
					limparCampos();
					JSFUtil.addInforMenssage("Funcionario gravado com sucesso!");
				} catch (Exception e) {
					JSFUtil.addErrorMenssage("Erro ao cadastrar o Funcionario!");
				}

			}

		}
		/*
		 * metodo para limpar campos
		 */
		
		private void limparCampos() {
			
			
			funcionario.setNome(null);
			funcionario.setCpf(null);
			funcionario.setRg(null);
			funcionario.setDataNascimento(null);
			funcionario.setIdade(Integer.parseInt(null));
			funcionario.setSexo(null);
			funcionario.setSenha(null);
			funcionario.setLogin(null);
			funcionario.setPerfilAcesso(null);
			
		}
		/*
		 * metodo  para retornar um objeto Funcionario
		 */
		private void get_Funcionario() {
			
			
			funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setRg(rg);
			funcionario.setDataNascimento(data_nascimento);
			funcionario.setIdade(Integer.parseInt(idade));
			funcionario.setSexo(sexo);
			funcionario.setLogin(login);
			funcionario.setSenha(senha);
			funcionario.setPerfilAcesso(perfil);
			funcionario.setContatoIdContato(contato);
			funcionario.setEnderecoIdEndereco(enderecos);
			
								
		}
		
		
		/*
		 * metodo para validar entrada 
		 */
		
		private boolean validar() {
			
			if (Valida.isEmptyOrNull(nome)) {
				JSFUtil.addErrorMenssage("Informe o nome, campo obrigatório!");
				return false;
			}
			
			return true;
		}
		
		/*
		 * método para pesquisar filmes
		 */
		public String pesquisar() {
			
			try {
				listaFuncionarios = new FuncionarioController().buscarPorNome(nomePesquisar);
			} catch (Exception e) {
				JSFUtil.addErrorMenssage("Erro ao pesquisar Filmes!");
			}
			
			return "";
			
		}
		
		/*
		 * método para abrir a tela de consulta
		 */
		public String consultarFuncionario() {
			
			return "";
		}
		
		/*
		 * metodo para alterar filme
		 */
		
		public void alterarFuncionario() {

			if (validar()) {

				try {
					getFuncionarioAlterar();
					new FuncionarioController().salvar(funcionario);
					limparCampos();
					JSFUtil.addInforMenssage("Funcionario alterado com sucesso!");
				} catch (Exception e) {
					JSFUtil.addErrorMenssage("Erro ao alterar o Funcionario!");
				}

			}

		}
		private void getFuncionarioAlterar() {
			
			funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setCpf(cpf);
			funcionario.setRg(rg);
			funcionario.setDataNascimento(data_nascimento);
			funcionario.setIdade(Integer.parseInt(idade));
			funcionario.setSexo(sexo);
			funcionario.setLogin(login);
			funcionario.setSenha(senha);
			funcionario.setPerfilAcesso(perfil);
			funcionario.setContatoIdContato(contato);
			funcionario.setEnderecoIdEndereco(enderecos);
		}

}
