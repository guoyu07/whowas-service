package net.apnic.whowas.types;

public class Tuple<S,T> {
    private final S s;
    private final T t;

    public Tuple(S s, T t) {
        this.s = s;
        this.t = t;
    }

    public static <S, T> Tuple<S, T> of(S s, T t) {
        return new Tuple<S, T>(s, t);
    }

    public S fst() { return s; }
    public T snd() { return t; }

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof Tuple<?,?> && s.equals(((Tuple)o).fst()) && t.equals(((Tuple)o).snd());
    }

    @Override
    public int hashCode() {
        return 41 * (41 + s.hashCode()) + t.hashCode();
    }

    @Override
    public String toString() {
        return "(" + s.toString() + ", " + t.toString() + ")";
    }
}
