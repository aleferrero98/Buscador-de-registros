/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.io.*;
/**
 *
 * @author alejandro
 */
public class LectorDeTxt {
   private File archivo;
   private FileReader fr;
   private BufferedReader br;
   
   public LectorDeTxt(){
      this.archivo = null;
      this.fr = null;
      this.br = null;
   }
   
   
   String leerTxt(String ruta){
      String path = "";
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (ruta);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
             path = linea;
         }
            
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return path;
   }
}

