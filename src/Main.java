import BST.ArvoreBinaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArvoreBinaria ab =  new ArvoreBinaria(10);

        ab.inserir(18);
        ab.inserir(1);
        ab.inserir(5);
        ab.inserir(3);
        ab.inserir(2);
        ab.inserir(13);
        ab.inserir(20);


        System.out.println(ab.parent(18).getValor());
    }
}