package core.basesyntax;

class Ball {
    private String color;
    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " ball with " + number + " number.";
    }
}
