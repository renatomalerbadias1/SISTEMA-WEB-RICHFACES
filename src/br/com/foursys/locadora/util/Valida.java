package br.com.foursys.locadora.util;

import org.apache.jasper.tagplugins.jstl.core.If;

/**
 * Classa para armazenar os métodos de validação de dados
 * @author Renato Dias
 * @since Mar 17, 2021
 * @version 1.0
 */
public class Valida {
    
    /*
    * método para verificar se o campo é diferente de vazio ou nulo
    */
    public static boolean isEmptyOrNull(String args) {
        return args.trim().equals("") || args == null;
    }
    
    /*
    * método para verificar se o valor inserido é do tipo inteiro
    */
    public static boolean isInteger(String args) {
        try {
            Integer.parseInt(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public static boolean isDouble(String args) {
        try {
            Double.parseDouble(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    public static boolean isDoubleZero(Double num) {
    	
    	if (num ==0) {
    		return true;
			
		}
    	
    	return false;
    	
        
    }
    
public static boolean isIntZero(Integer num) {
    	
    	if (num ==0) {
    		return true;
			
		}
    	
    	return false;
    	
        
    }
    
}
