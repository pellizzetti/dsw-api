package br.udesc.ceavi.dsw.pfinal;

import static spark.Spark.get;

public class TestService {
    public static void main( String[] args) {
        get("/helloworld", (req, res) -> "Feels bad, man...");
    }
}
