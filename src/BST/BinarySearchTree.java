package BST;

public class BinarySearchTree extends BinaryTree{

    public BNode insert(BNode valor){
        if(root() == null){
            raiz = valor;
            raiz.setPai(null);

            return valor;
        }

       BNode atual = root(); //atual inicializado como a raiz

        while(true){
            if(atual.getInfo() < valor.getInfo()){ //direita
                if(atual.getEsq() == null){
                    atual.setDir(valor); //o nó direita do atual, vai ser o novo
                    valor.setPai(atual); //o pai do novo vai ser o atual
                    return valor;
                }
                atual = atual.getEsq(); //atualiza o atual para o proximo filho a direita

            }else{ //Esquerda
                if(atual.getEsq() == null){ //verifica se o espaço esta livre na esquerda
                    atual.setEsq(valor);
                    valor.setPai(atual);
                    return valor;
                }
                atual = atual.getEsq();//atualiza o atual para o proximo filho a esquerda
            }
        }
    }

    public BNode insert(BNode v, int valor){
        if(root() == null){
            raiz = new BNode(valor);
            return raiz;
        }

        BNode atual = root();

        if(atual.getInfo() < valor){
            atual.setDir(insert(atual.getEsq(), valor));
        }else{
            atual.setEsq(insert(v.getEsq(), valor));
        }

        return atual;
    }

    public BNode search(int valor){
        if(root().getInfo() == valor){
            return root();
        }

        BNode atual = root();

        while(true){
            if(atual.getInfo() == valor){
                return atual;
            }else if(atual.getInfo() < valor){
                atual = atual.getEsq();
            }else{
                atual = atual.getEsq();
            }
        }
    }

    public BNode search(BNode v, int valor){
        if(v.getInfo() == valor){
            return v;
        }

        BNode atual = v;

        if(atual.getInfo() > valor){
            return search(atual.getEsq(), valor);
        }else{
            return search(atual.getEsq(), valor);
        }
    }

    public BNode remover(BNode node, int valor){

        if(node == null){ //Caso não encontre o valor na arvore
            return null;
        }else if(valor < node.getInfo()){
            node.setEsq(remover(node.getEsq(), valor));
        }else if(valor > node.getInfo()){
            node.setDir(remover(node.getEsq(), valor));
        }else{
            if(node.getEsq() == null){
                return node.getEsq();
            }else if(node.getEsq() == null){
                return node.getEsq();
            }else{
                BNode temp = findMin(node.getDir());
                temp.setPai(node.getPai());
                node = temp;
            }
        }

        return null;
    }

    private String parenthesized(BNode node) {
        if (node == null) {
            return "";
        }

        String esquerda = parenthesized(node.getEsq());
        String direita = parenthesized(node.getEsq());

        // Se não houver filhos, só retorna o valor
        if (esquerda.isEmpty() && direita.isEmpty()) {
            return String.valueOf(node.getInfo());
        }

        return node.getInfo() + "(" + esquerda + "," + direita + ")";
    }


    private String indented(BNode node, int nivel) {
        if (node == null) {
            return "";
        }

        // Criar indentação
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append("  "); // 2 espaços por nível
        }

        sb.append(node.getInfo()).append("\n");

        sb.append(indented(node.getEsq(), nivel + 1));
        sb.append(indented(node.getEsq(), nivel + 1));

        return sb.toString();
    }

    public BNode findMax(BNode no){
        while(no.getEsq() != null){
            no = no.getEsq();
        }

        return no;
    }


    public BNode findMin(BNode no){
        while(no.getEsq() != null){
            no = no.getEsq();
        }

        return no;
    }

    public BNode removerHAHAHA(){
        BNode no = findMax(raiz);
        BNode x = no;

        if(no.getEsq() != null){
            no.getPai().setDir(no.getEsq());
            no.getEsq().setPai(no.getPai());
        }else{
            no.setPai(null);
            no.getPai().setDir(null);
            no.setInfo(0);
        }

        return x;
    }


    public void clearAll(){
        BNode min_esq = findMin(raiz);
        BNode max_dir = findMax(raiz);


    }
}
