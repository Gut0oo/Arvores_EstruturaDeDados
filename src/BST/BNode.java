package BST;

public class BNode implements Comparable<BNode>{
    private int info;
    private BNode parent, left, right;

    public BNode(int info, BNode parent){
        this.info = info;
        this.parent = parent;
    }

    public int getInfo() {
        return info;
    }

    public int degree(){
        int count = 0;

        if(left != null){
            count ++;
        }

        if(right != null){
            count ++;
        }

        return count;
    }

    public BNode left(){
        if(this.left == null){
            return null;
        }

        return this.left;
    }

    public BNode right(){
        if(this.right == null){
            return null;
        }

        return this.right;
    }

    public void setLeft(BNode v){
        this.left = v;          //novo valor filho
        if(v != null){          //Verifica se o nó passado não é null
            v.parent = this;    // Aqui fala que o pai do nó v é o objeto que chamou a função (this)
        }
    }

    public void setRight(BNode v){
        this.right = v;

        if(v != null){
            v.parent = this;    //Esse this faz referência ao nó que chamou o método
        }
    }

    @Override
    public int compareTo(BNode outro) {
        return Integer.compare(this.info, outro.info);
    }

}
