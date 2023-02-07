import org.jetbrains.annotations.Nullable;

public class GeoCloudDataSource implements DataSource<GeoData> {
    @Override
    public @Nullable GeoData data() {
        return new GeoData(3.4, 5.6);
    }
}
