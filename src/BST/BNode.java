package BST;

public class BNode {
    private int info;
    private BNode esq, dir, pai;

    public BNode(int info){
        this.info = info;
    }

    public int degree(){
        int count = 0;

        if(esq != null){ //verifica se tem filho na esquerda
            count++;
        }

        if(dir != null){ //verifica se tem filho na direita
            count++;
        }

        return count;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public int getInfo(){
        return info;
    }

    public void setEsq(BNode esq){
        this.esq = esq;
    }

    public BNode getEsq(){
        return esq;
    }

    public void setDir(BNode dir){
        this.dir = dir;
    }

    public BNode getDir(){
        return dir;
    }

    public void setPai(BNode pai) {
        this.pai = pai;
    }

    public BNode getPai() {
        return pai;
    }
}
