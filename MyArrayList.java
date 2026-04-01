public class MyArrayList implements MyArrayListTAD {
    private int[] data;
    private int size;

    public MyArrayList(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    @Override
    public void addLast(int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        data[size] = newItem;
        size++;
    }

    @Override
    public void addFirst(int newItem) {
        insertAt(0, newItem);
    }

    @Override
    public void insertAt(int index, int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Erro: Índice inválido!");
            return;
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = newItem;
        size++;
    }

    @Override
    public void addSorted(int newItem) {
        if (isFull()) return;
        int i = 0;
        while (i < size && data[i] < newItem) {
            i++;
        }
        insertAt(i, newItem);
    }

    @Override
    public void removeLast() {
        if (isEmpty()) return;
        size--; // Em listas sequenciais, basta diminuir o contador
    }

    @Override
    public void removeFirst() {
        removeAt(0);
    }

    @Override
    public void removeAt(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Erro: Operação inválida!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public void remove(int item) {
        int index = find(item);
        if (index != -1) {
            removeAt(index);
        }
    }

    @Override
    public int find(int item) {
        for (int i = 0; i < size; i++) {
            if (data[i] == item) return i;
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return data[index];
    }

    @Override
    public void set(int index, int newItem) {
        if (index >= 0 && index < size) {
            data[index] = newItem;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public void display() {
        System.out.print("Lista: [");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + (i == size - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}