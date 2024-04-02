public class Fila {
    int tamanho;
    int[] elementos;
    int inicio;
    int fim;
    int quantidade;

    void criarFila(int tamanhoMaximo) {
        tamanho = tamanhoMaximo;
        elementos = new int[tamanhoMaximo];
        inicio = 0;
        fim = -1;
        quantidade = 0;
    }

    void destruirFila() {
        elementos = null;
    }

    boolean filaCheia() {
        return quantidade == tamanho;
    }

    boolean filaVazia() {
        return quantidade == 0;
    }

    void inserirElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro: A fila está cheia.");
            return;
        }
        fim = (fim + 1) % tamanho;
        elementos[fim] = elemento;
        quantidade++;
    }

    int removerElemento() {
        if (filaVazia()) {
            System.out.println("Erro: A fila está vazia.");
            return -1;
        }
        int elementoRemovido = elementos[inicio];
        inicio = (inicio + 1) % tamanho;
        quantidade--;
        return elementoRemovido;
    }

    int localizarElemento(int elemento) {
        int posicao = -1;
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i] == elemento) {
                posicao = i;
                break;
            }
        }
        return posicao;
    }

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.criarFila(10);
        fila.inserirElemento(10);
        fila.inserirElemento(20);
        fila.inserirElemento(30);
        System.out.println("Elemento removido: " + fila.removerElemento());
        int posicao = fila.localizarElemento(20);
        if (posicao != -1) {
            System.out.println("Elemento 20 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 20 não encontrado na fila.");
        }
        fila.destruirFila();
    }
}
