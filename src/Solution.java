public class Solution {
    public static void main(String[] args) {
        Repository<MyData> repository = new Repository<>(new MyDataCloudDataSource(),
                new CacheDataSource<>()
        );
        MyData data = repository.data();
    }

}
