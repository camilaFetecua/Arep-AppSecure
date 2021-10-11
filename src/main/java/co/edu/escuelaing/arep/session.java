package co.edu.escuelaing.arep;

import spark.Request;
import spark.Response;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class session extends URLReader{

    public static boolean login (Request request, Response response){
        String userLog = "camilaFetecua";
        String passLog = "827ccb0eea8a706c4c34a16891f84e7b";
        boolean logged = false;
        if (request.queryParams("user") != null && request.queryParams("pssd") != null){
            try {
                String hash = DatatypeConverter.printHexBinary(MessageDigest.getInstance("MD5").digest(request.queryParams("pssd").getBytes("UTF-8")));
                hash = hash.toLowerCase();
                if (request.queryParams("user").equals(userLog) && hash.equals(passLog)){
                    logged = true;
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }else {
            logged = false;
        }
        return logged;
    }

    public static String isLogged (Request request, Response response){
        String res = "";
        if (login(request, response)){
            res += "Ingreso autorizado";
        }else {
            res += "Error, el usuario y/o la contraseña son incorrectos";
        }
        return res;
    }

}
