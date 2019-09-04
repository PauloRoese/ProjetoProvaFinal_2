
package Control;

import javax.swing.JOptionPane;


public  class Clogin {
    
      public static boolean login (String login, String senha){
         if(login .equals("admin") && senha .equals("admin")){
           return true;
       }else{
             System.out.println("Senha incorreta");
             return false;
       }
          
    }
}
