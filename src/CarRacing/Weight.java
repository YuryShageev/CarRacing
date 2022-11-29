package CarRacing;

public enum Weight {

    N1(0f, 3.5f),
    N2(3.4f, 12f),
    N3(12f, null);

    private final Float from;
    private final Float to;

    Weight(Float from, Float to) {
        this.from = from;
        this.to = to;
    }

    public Float getFrom() {
        return from;
    }

    public Float getTo() {
        return to;
    }
}
