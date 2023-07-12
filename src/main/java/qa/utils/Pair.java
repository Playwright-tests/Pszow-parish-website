package qa.utils;

public class Pair<A, B> {

    private A first;
    private B second;

    public Pair() { }

    public Pair(A first, B second) {

        this.first = first;
        this.second = second;
    }

    public A getFirst() {

        return first;
    }

    public B getSecond() {

        return second;
    }
}