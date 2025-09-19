package BST;

public class BinaryTree {
    private BNode root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(BNode root){
        this.root = root;
    }

    // ***** Métodos de acesso *****
    public BNode root(){
        return root;
    }

    public void setRoot(BNode root){
        this.root = root;
    }

    // ***** Métodos de consulta *****
    public boolean isComplete(){

        return false;
    }

    public boolean isFull(BNode atual){
        if(isEmpty()){
            return false;
        }

        if(atual == null){
            return true;
        }

        if(atual.left() == null && atual.right() == null){
            return true;
        }

        if(atual.left() != null && atual.right() != null){
            return isFull(atual.left()) && isFull(atual.right());
        }

        return false;
    }

    public boolean isEmpty(){
        return root() == null;
    }

    // ***** Métodos genéricos *****
    public int height(BNode atual){
        if(isEmpty()){
            return -1;
        }

        return 1 + Math.max(height(atual.left()), height(atual.right()));
    }
}
