import ArvoreGeral.*;
import BST.BNode;
import BST.BinarySearchTree;
import BST.BinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BNode raiz = new BNode(10, null);
        BinarySearchTree tree =  new BinarySearchTree(raiz);
        
        tree.insertRecursivo(raiz, 15);
        tree.insertRecursivo(raiz, 8);
        tree.insertRecursivo(raiz, 5);
        tree.insertRecursivo(raiz, 12);

        tree.exibirEmOrdem(raiz);
        System.out.println();
        tree.exibirPosOrdem(raiz);
        System.out.println();
        tree.exibirPreOrdem(raiz);


    }
}