package BST;

public class BinaryTree {
    BNode raiz;

    public BinaryTree(){}

    public BNode root(){
        if(raiz == null){
            return null;
        }
        return raiz;
    }

    public boolean isFull(BNode v){
        if(v == null){ //Arvore vazia == full
            return true;
        }

        if(v.getEsq() == null && v.getDir() == null){ //Se é folha
            return true;
        }

        if(v.getEsq() == null || v.getDir() == null){ //Só um filho
            return false;
        }

        return isFull(v.getDir()) && isFull(v.getEsq()); //Verifica recursivamente os filhos
    }

    public boolean isComplete(BNode v){
        return true;
    }

    public boolean isEmpty(){
        return raiz == null;
    }

    public int height(BNode v){
        if(v == null){
            return 0;
        }

        int count = 0;
        BNode atual = v;

        if(atual.getEsq() != null){
            int tam_esq = height(atual.getEsq());

            if(count < tam_esq){
                count = tam_esq;
            }
        }

        if(atual.getDir() != null){
            int tam_dir = height(atual.getDir());

            if(count < tam_dir){
                count = tam_dir;
            }
        }

        return count + 1;
    }


}
