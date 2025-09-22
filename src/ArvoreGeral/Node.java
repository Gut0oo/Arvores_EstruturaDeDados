package ArvoreGeral;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String valor;
    List<Node> filhos;
    Node pai;

    public Node(String valor){
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }

    public void addFilho(Node filho){
        filho.pai = this;
        filhos.add(filho);
    }

    public void removerFilho(Node filho){
        filhos.remove(filho);
        filho.pai = null;
    }

    public boolean ehFolha(){
        return filhos == null;
    }
}
