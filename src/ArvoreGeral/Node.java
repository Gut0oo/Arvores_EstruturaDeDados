package ArvoreGeral;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int valor;
    List<Node> filhos;

    public Node(int valor){
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }

    public void addFilho(Node filho){
        filhos.add(filho);
    }

    public void removerFilho(Node filho){
        filhos.remove(filho);
    }

    public boolean ehFolha(){
        return filhos.isEmpty();
    }

    public int contagemFilhos(){
        return filhos.size();
    }
}
