package org.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8080); // default Spark port
        get("/", (req, res) -> "Hello, World!");
        get("/hello/:name", (req, res) -> "Hello, " + req.params(":name") + "!");
    }
}