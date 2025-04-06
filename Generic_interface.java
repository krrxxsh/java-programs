interface Container<T> {
    void add(T item);
    T get();
}

class Box<T> implements Container<T> {
    T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

class Generic_Interface {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.add(10);
        System.out.println("Box contains: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.add("Hello");
        System.out.println("Box contains: " + strBox.get());
    }
}
