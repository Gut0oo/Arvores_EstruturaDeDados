package ArvoreGeral;

import java.util.List;

public class Arvore {
    private Node raiz;

    public Arvore(int valor){
        this.raiz = new Node(valor);
    }

    public Node root(){
        if(raiz == null){
            return null;
        }
        return raiz;
    }

    //****** Métodos de acesso ******
    public Node parent(Node atual, Node v){
        if(atual.equals(v) || atual == null){ //Caso o Node V seja a raiz ou não tenha nenhum Node na raiz
            return null;
        }

        if(atual.filhos.contains(v)){ // Caso o Node v seja o filho da raiz
            return atual;
        }

        //Caso não tenha encontrado direto
        for(Node filho : atual.filhos){
            Node resultado = parent(filho, v);
            if(resultado != null){
                return resultado;
            }
        }

        return null; //Caso não ache
    }

    public List<Node> children(Node atual, Node v){
        if(atual.equals(v)){
            return v.filhos;
        }

        for(Node filho : atual.filhos){
            List<Node> resultado = children(filho, v);
            if(resultado != null){
                return resultado;
            }
        }

        return null;
    }

    //****** Métodos de Consulta ******
    public boolean isInternal(Node v) {
        return !v.filhos.isEmpty();
    }

    public boolean isExternal(Node v){
        return v.filhos.isEmpty();
    }

    public boolean isRoot(Node v){
        return v.equals(raiz);
    }

    //****** Métodos de Genéricos ******
    public int size(Node atual){
        if(atual == null){
            return 0;
        }
        int count = 1;

        for(Node filho : atual.filhos){
            count += size(filho);
        }

        return count;
    }

    public boolean isEmpty(){
        return raiz == null;
    }

    public Node replace(Node v, Node e){
        if (v == null || e == null)
            return null;

        e.filhos = v.filhos;
        v.filhos = null;

        if(v.equals(raiz)){
            this.raiz = e;
            return v;
        }

        Node pai = parent(raiz, v);
        if (pai == null)
            return null;

        pai.removerFilho(v);
        pai.addFilho(e);


        return v;
    }

    public int depth(Node v){
        if(raiz.equals(v)){
            return 0;
        }

        int count = 1;
        
        
    }

    public int height(){

        
        return 0;
    }

    public int height(Node v){
        return 0;
    }
}
