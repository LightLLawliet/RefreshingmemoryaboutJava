import org.jetbrains.annotations.NotNull;

public final class CacheDataSource<T> implements MutableDataSource<T> {

    private T data;

    @NotNull
    @Override
    public T data() {
        return data;
    }

    @Override
    public void saveData(T data) {
        this.data = data;
    }
}
