public enum Symbol {
    X('X'),
    O('O'),
    EMPTY(' ');

    private Character c;

    Symbol(Character c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}
