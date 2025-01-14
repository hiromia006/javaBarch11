package class7.generic;

public class DataType<T> {

    private T data;

    public DataType(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
