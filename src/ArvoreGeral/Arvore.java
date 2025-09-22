package ArvoreGeral;

import java.util.List;

public class Arvore {
    Node raiz;
    public Arvore(Node raiz){
        this.raiz = raiz;
    }

    public Node root(){
        return raiz;
    }

    public Node parent(Node v){
        if(v == raiz){
            return null;
        }

        Node atual = raiz;

        if(atual.filhos.contains(v)){
            return atual;
        }

        for(Node filho : atual.filhos){
            if(filho.filhos.contains(v)){
                return filho;
            }
        }

        return null;
    }

    public List<Node> children(Node v){
        if(v.ehFolha()){
            return null;
        }

        return v.filhos;
    }

    public boolean isInternal(Node v){
        return v.filhos != null;
    }

    public boolean isExternal(Node v){
        return v.filhos == null;
    }

    public boolean isRoot(Node v){
        return v.pai == null;
    }

    public int size(){
        if(raiz == null){
            return 0;
        }
        Node atual = raiz;

        int count = 1;

        for(Node filho : atual.filhos){
            count += size();
        }

        return count;
    }

    public boolean isEmpty(){
        return raiz == null;
    }

    public String replace(Node v, Node e){
        if(v == null || e == null){
            return null;
        }

        Node pai_v = v.pai; //guarda o pai de v
        e.filhos = v.filhos;


        pai_v.removerFilho(v); //v deixa de ser filho do nó pai
        v.pai = null; //desconecta do nó pai
        v.filhos = null;

        pai_v.addFilho(e);
        e.pai = pai_v; //e se torna filho de pai_v

        return v.valor;
    }

    public int depth(Node v){
        if(v == raiz){
            return 0;
        }

        int count = 1;
        Node atual = v;

        while(atual.pai != raiz){
            count++;
            atual = atual.pai;
        }

        return count;
    }

    public int height(Node v){
        if(v == null){
            return 0;
        }
        int count = 0;

        for(Node atual : v.filhos){
            int result = height(atual);

            if(result > count){
                count = result;
            }
        }
        return count + 1;
    }

    public int height(){
        return height(raiz);
    }
}
