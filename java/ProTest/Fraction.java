package ProTest;

class Fraction {
    private int x;
    private int y;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x + "/" + y;

    }

    public double toDouble() {
        return (double) x / y;
    }

    public boolean equals(Fraction other) {
        return this.x == other.x && this.y == other.y;
    }

    public double simolify(){
        return
    }

}
