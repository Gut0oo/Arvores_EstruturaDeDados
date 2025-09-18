import ArvoreGeral.*;
import BST.ArvoreBinaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArvoreBinaria ab =  new ArvoreBinaria(10);

        Arvore ag = new Arvore(10);

        Node raiz = ag.root();

        Node filho1 = new Node(20);
        Node filho2 = new Node(30);

        raiz.addFilho(filho1);
        raiz.addFilho(filho2);

        Node filho1_1 = new Node(35);
        Node filho1_2 = new Node(40);

        filho1.addFilho(filho1_1);
        filho1.addFilho(filho1_2);

        //System.out.println(ab.parent(18).getValor());
        if(ag.isInternal(filho2)){
            System.out.println("Real");
        }else{
            System.out.println("Fake");
        }
    }
}