import BST.BNode;
import BST.BinarySearchTree;
import BST.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(5);
        bst.insert(15);

        System.out.println(bst.toString());
    }
}