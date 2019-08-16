import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SiteServiceUrlImpl implements ISiteService {

    public Site[] getSites(){
        Site[] ordenado = null;

        try {
            URL url = new URL("https://api.mercadolibre.com/sites");
            try {
                URLConnection urlConnection = url.openConnection();
                urlConnection.setRequestProperty("Accept", "application/json");
                urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");



                if (urlConnection instanceof HttpURLConnection) {
                    HttpURLConnection connection = (HttpURLConnection) urlConnection;
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    Gson gson = new Gson();
                    Site[] sites =  gson.fromJson(in, Site[].class);
                    Operador op1 = new Operador();
                    ordenado = op1.ordenar(sites);



                } else {
                    System.out.println("URL inválida.");
                }


            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }
        return ordenado;
    }

    public Category[] getCategories(String id){
        Category[] ordenado2 = null;

        try {
            URL url2 = new URL("https://api.mercadolibre.com/sites/" + id + "/categories");
            try {
                URLConnection urlConnection2 = url2.openConnection();
                urlConnection2.setRequestProperty("Accept", "application/json");
                urlConnection2.setRequestProperty("User-Agent", "Mozilla/5.0");



                if (urlConnection2 instanceof HttpURLConnection) {
                    HttpURLConnection connection = (HttpURLConnection) urlConnection2;
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                    Gson gson = new Gson();
                    Category[] categories1 =  gson.fromJson(in, Category[].class);
                    Operador op1 = new Operador();
                    ordenado2 = op1.ordenar(categories1);



                } else {
                    System.out.println("URL inválida.");
                }


            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }
        return  ordenado2 ;

    }
}
