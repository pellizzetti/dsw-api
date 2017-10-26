import static spark.Spark.get;

public class TestService {
    public static void main( String[] args) {
        get("/helloworld", (req, res) -> "Hello Sparkingly World!");
    }
}
