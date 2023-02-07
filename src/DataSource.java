import org.jetbrains.annotations.Nullable;

public interface DataSource<T> {

    @Nullable
    T data();
}
