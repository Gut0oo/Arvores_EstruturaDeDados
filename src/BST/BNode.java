package BST;

public class BNode {
    private int valor;
    private BNode esquerda, direita;

    public BNode(){}

    public BNode(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public BNode getDireita() {
        return direita;
    }

    public BNode getEsquerda() {
        return esquerda;
    }

    public int getValor() {
        return valor;
    }

    public void setDireita(BNode direita) {
        this.direita = direita;
    }

    public void setEsquerda(BNode esquerda) {
        this.esquerda = esquerda;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
