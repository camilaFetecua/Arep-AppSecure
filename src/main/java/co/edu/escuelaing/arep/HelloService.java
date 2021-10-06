package co.edu.escuelaing.arep;

import static spark.Spark.*;

public class HelloService {

    public static void main(String... args){
        secure("ecikeystore.p12","123456",null,null);
        port(getPort());
        get("hello",(req,res) -> "hello world");

    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
