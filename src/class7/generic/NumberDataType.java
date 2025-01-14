package class7.generic;

public class NumberDataType<T extends Number> {
    private T numberT;

    public NumberDataType(T numberT) {
        this.numberT = numberT;
    }

    public T getNumber() {
        return numberT;
    }
}
