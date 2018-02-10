/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){
        if (word.toUpperCase().contains(searched.toUpperCase().trim())){
            return true;
        }
        
        return false;
    }
}
