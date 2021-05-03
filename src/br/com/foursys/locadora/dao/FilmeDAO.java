package br.com.foursys.locadora.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.util.HibernateUtil;

/**
 * Classa para armazenar os mÃ©️todos para acesso ao bando de dados
 * @author renato dias
 * @since Apr 27, 2021
 * @version 1.0
 */
public class FilmeDAO extends GenericDAO {
    
    /*
    * mÃ©️todo para consultar os alunos gravados na tabela
    */
    public ArrayList<Filme> buscarPorNomes( String nome) throws Exception {
        // lista auxiliar para retorno no mÃ©️todo
        ArrayList<Filme> retorno = new ArrayList<>();
        // classe auxiliar para armazenar a sessÃ£o com o banco de dados
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        // classe auxiliar para consultar o banco de dados
        Criteria criteria = sessao.createCriteria(Filme.class);
        // adicionando a ordenaÃ§Ã£o da pesquisa
        criteria.addOrder(Order.asc("idFilme"));
        
        criteria.add(Restrictions.like("nome", nome +"%"));
        
        
        
        // valorizando o objeto de retorno do mÃ©️todo com os registros da tabela
        retorno = (ArrayList<Filme>) criteria.list();
        // encerrando a conexÃ£o com o banco de dados
        sessao.close();
        //retornanado a lista preenchida
        return retorno;
    }

}