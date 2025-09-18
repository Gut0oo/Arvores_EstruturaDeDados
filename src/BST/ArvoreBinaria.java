package BST;

public class ArvoreBinaria {
    private BNode raiz;

    public ArvoreBinaria(int valor){
        this.raiz = new BNode(valor);
    }
    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(int valor){
        BNode newBNode = new BNode(valor);

        if(raiz == null){ //Caso não exista um nó na arvore
            raiz = newBNode;
            return;
        }

        BNode atual = raiz;

        while(true){
            if(valor > atual.getValor()){
                if(atual.getDireita() == null){ //Caso não tenha nó a direita, adiciona o nó
                    atual.setDireita(newBNode);
                    return;
                }
                atual = atual.getDireita();
            }else if(valor < atual.getValor()){
                if(atual.getEsquerda() == null){ //Caso não tenha nó a esquerda, adiciona o nó
                    atual.setEsquerda(newBNode);
                    return;
                }
                atual = atual.getEsquerda();
            }else{
                return; //Evita duplicatas
            }
        }
    }

    public BNode buscar(int valor) {
        BNode atual = raiz;

        while (atual != null) {
            if (atual.getValor() == valor) {
                return atual;
            } else if (atual.getValor() > valor) {
                atual = atual.getEsquerda();
            } else {
                atual = atual.getDireita();
            }
        }

        return null;
    }

    public BNode root(){
        if(raiz == null){
            return null;
        }
        return raiz;
    }

    public BNode inserirRecursivo(BNode atual, int valor){
        if(atual == null){
            return new BNode(valor);
        }

        if(valor < atual.getValor()){
            atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), valor));
        }else{
            atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
        }

        return atual;
    }

    public BNode buscarRecursivo(BNode atual, int valor){
        if(atual.getValor() == valor){
            return atual;
        }

        if(atual.getValor() < valor){
            return buscarRecursivo(atual.getDireita(), valor);
        }else {
            return buscarRecursivo(atual.getEsquerda(), valor);
        }
    }

    public BNode parent(int v){
        if(this.raiz.getValor() == v || this.raiz == null){
            return null;
        }

        BNode atual = raiz;

        while(atual != null){
            if(atual.getDireita() != null && atual.getDireita().getValor() == v || atual.getEsquerda() != null && atual.getEsquerda().getValor() == v){
                return atual;
            }else if(v < atual.getValor()){
                atual = atual.getEsquerda();
            }else{
                atual = atual.getDireita();
            }
        }

        return null;
    }

    public void exibirEmOrdem(BNode atual){
        if(atual != null){
            exibirEmOrdem(atual.getEsquerda());
            System.out.println(atual.getValor() + " ");
            exibirEmOrdem(atual.getDireita());
        }

    }

    public void exibirPreOrdem(BNode atual){
        if(atual != null){
            System.out.println(atual.getValor());
            exibirPreOrdem(atual.getEsquerda());
            exibirPreOrdem(atual.getDireita());
        }
    }

    public void exbirPosOrdem(BNode atual){
        if(atual != null){
            exbirPosOrdem(atual.getEsquerda());
            exbirPosOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }
}
