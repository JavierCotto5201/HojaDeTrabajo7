import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/**
 * @authorJavier Alejandro Cotto Argueta
 * @Carne 19324
 * @date 21/03/19
 * @see https://www.geeksforgeeks.org/binary-tree-set-1-introduction/
 * @see http://decodigo.com/java-leer-un-archivo-de-texto
 **/
public class Main{
	public static void main(String [] args){
		BinaryTree tree = new BinaryTree(); 
		String [] archivo = null;

	     /*create root*/
	     tree.root = new Node("house", "casa"); 

	     /* following is the tree after above statement 

	          house 
	         /   \ 
	       null  null     */

	     tree.root.left = new Node("dog", "perro"); 
	     tree.root.right = new Node("woman", "mujer"); 

	     /* dog and woman become left and right children of house 
	           house
	          /    \ 
	        dog    woman
	       /   \     /  \ 
	     null null null null  */


	     tree.root.left.right = new Node("homework", "tarea"); 
	     tree.root.right.left = new Node("town", "pueblo");
	     tree.root.right.right = new Node("yes", "si");
	     /* homework becomes right child of dog
	      * town and yes becomes left an right child of woman
	               house
	             /       \ 
	           dog        woman
	          /   \        /  \ 
	        null homework town yes
	        /   \ 
	       null null 
	      */
	     //llamada del metodo in order
	     tree.inOrden(tree.root);
	     System.out.println("\n");
	     
	     try {
	            Scanner input = new Scanner(new File("C:\\Users\\Javier Cotto\\Desktop\\UVG Trabajos\\3er Semestre\\Estructura de datos\\HojaDeTrabajo7\\HojaDeTrabajo7\\src\\diccionario.txt"));
	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                archivo = line.split(" ");
	                System.out.println(line);
	            }
	            input.close();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	     
	     //Comparación de archivo con el arbol
	     for(int i=0; i<=archivo.length -1; i++) {	    	 
	    	 
	    	 if(archivo[i].equals(tree.root.getKey())) {
	    		 archivo[i]=tree.root.getValue().toString();
	    	 }
	    	 
	    	 if(archivo[i].equals(tree.root.right.getKey())) {
	    		 archivo[i]=tree.root.right.getValue();
	    	 }
	    	 
	    	 if(archivo[i].equals(tree.root.left.getKey())) {
	    		 archivo[i]=tree.root.left.getValue();
	    	 }
	    	 
	    	 if(archivo[i].equals(tree.root.right.left.getKey())) {
	    		 archivo[i]=tree.root.right.left.getValue();
	    	 }
	    	 
	    	 if(archivo[i].equals(tree.root.left.right.getKey())) {
	    		 archivo[i]=tree.root.left.right.getValue();
	    	 }
	    	 
	    	 if(archivo[i].equals(tree.root.left.right.getKey())) {
	    		 archivo[i]=tree.root.left.right.getValue();
	    	 }
	     }
	     
	     for(int x=0; x<=archivo.length-1;x++) {
	    	 System.out.println("*" + archivo[x] + "*");
	     }
	}
}
