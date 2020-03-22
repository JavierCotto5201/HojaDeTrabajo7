import java.util.*;
/**
 * @authorJavier Alejandro Cotto Argueta
 * @Carne 19324
 * @date 21/03/19
 * @see https://www.geeksforgeeks.org/binary-tree-set-1-introduction/
 **/

/* Class containing left and right child of current 
node and key value*/
class Node{ 
	String key;
	String val;
	Node left, right; 
	
	public Node(String item, String value) { 
		key = item;
		val = value;
		left = right = null; 
		}

	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	
	public String getValue() {
		// TODO Auto-generated method stub
		return val;
	}

	public Node getIzq() {
		// TODO Auto-generated method stub
		return left;
	}

	public Node getDer() {
		// TODO Auto-generated method stub
		return right;
	}
    	    	} 

//A Java program to introduce Binary Tree 
class BinaryTree{ 
	// Root of Binary Tree 
	Node root; 
	
	// Constructors 
	BinaryTree(String key, String val){ 
		root = new Node(key, val);
	}
	
	BinaryTree(){
		root = null; 
		}
	
	//metodo para obtener llave
	public Node getKey(Node key){
		return key;
	}
	
	//Metodo para obtener valor de una llave
	public Node getValue(Node value) {
		return value;
	}
	
	//Imprimir arbol en forma In-Order
	public void inOrden(Node n) {
        if (n == null) {
            return;
        }
        else {
            inOrden(n.getIzq());
            System.out.print(n.getKey() + " ");
            inOrden(n.getDer());
        }
    }
	
}
