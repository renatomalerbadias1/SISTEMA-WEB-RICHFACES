package br.com.foursys.locadora.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * classe responsvel por efetuar a conexao com o Banco de Dados
 * @author 
 * @since 27/04/2021
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class HibernateUtil {
    
    //atributo pra armzenara se��o de cominica��o
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    /*
    * metodo responsavel por criar a se��o de conex�o com o BD
    */
    
    private static SessionFactory buildSessionFactory(){
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }
    
    //metodo para acessar o atributo de conex�o e se�o com o BD
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
