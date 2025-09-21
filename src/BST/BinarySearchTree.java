package BST;

public class BinarySearchTree extends BinaryTree{

    public BinarySearchTree(){
        super();
    }

    public BinarySearchTree(BNode root){
        super(root);
    }

    public void insertInterativo(int key){
        if(isEmpty()){
            setRoot(new BNode(key, null));
        }

        BNode atual = root();

        while(true){
            if(key < atual.getInfo()){
                if(atual.left() == null){
                    atual.setLeft(new BNode(key, atual));
                    break;
                }
                atual = atual.left();
            }

            if(key > atual.getInfo()){
                if(atual.right() == null){
                    atual.setRight(new BNode(key, atual));
                    break;
                }
                atual = atual.right();
            }

        }
    }

    public BNode insertRecursivo(BNode atual, int key){
        if(atual == null){
            return new BNode(key, null);
        }

        if(key < atual.getInfo()){ //Ve pra qual lada vai
            atual.setLeft(insertRecursivo(atual.left(), key)); //define o filho esquerdo como o resultado da recursão
        }else{
            atual.setRight(insertRecursivo(atual.right(), key)); //define o filho direito como o resultado da recursão
        }

        return atual;
    }

    public BNode searchInterativo(int key){
        if(isEmpty()){
            return null;
        }

        BNode atual = root();

        while(true){
            if(atual.getInfo() == key){ //caso encontre a key
                return atual;
            }else if(atual.getInfo() < key){ //ve qual lado vai (esquerda ou direita)
                atual = atual.right();
            }else{
                atual = atual.left();
            }
        }
    }

    public BNode searchRecursivo(BNode atual, int key){
        if(isEmpty() || atual == null){//caso base 1 - Se a arvore estiver vazia ou se o atual não for encontrado(Chegou até o final da arvore) retorna null
            return null;
        }

        if(atual.getInfo() == key){ //caso base 2 - caso que o valor do atual for igual a key, retorna o atual
            return atual;
        }

        if(atual.getInfo() < key){ //Decide qual lado a busca vai
            return searchRecursivo(atual.right(), key); //lado direito
        }else{
            return searchRecursivo(atual.left(), key); //lado esquerdo
        }
    }

    //public BNode deleteInterativo(int valor){}
    //public BNode deleteRecursivo(){}

    public void exibirPosOrdem(BNode atual){
        if(atual != null){
            exibirPosOrdem(atual.left());
            exibirPosOrdem(atual.right());
            System.out.println(atual.getInfo() + " ");   
        }

    }

    public void exibirPreOrdem(BNode atual){
        if(atual != null){
            System.out.println(atual.getInfo() + " ");
            exibirPreOrdem(atual.left());
            exibirPosOrdem(atual.right());
        }
    }

    public void exibirEmOrdem(BNode atual){
        if(atual != null){
            exibirEmOrdem(atual.left());
            System.out.println(atual.getInfo() + " "); 
            exibirEmOrdem(atual.right());
        }

    }


}
