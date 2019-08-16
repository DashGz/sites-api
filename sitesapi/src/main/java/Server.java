import com.google.gson.Gson;

import java.util.Collection;

import static spark.Spark.*;


public class Server {
    public static void main(String[] args) {

        port(8083);
        final ISiteService service = new SiteServiceUrlImpl();


        get("/sites", (req, res) -> {
            res.type("application/json");
            Site[] sites = service.getSites();
            return new Gson().toJson(new Gson().toJsonTree(sites));
        });

        get("/sites/:id/categories", (req, res) -> {
            res.type("application/json");
            Category[] categories = service.getCategories(req.params(":id"));
            return new Gson().toJson(new Gson().toJsonTree(categories));
        });

    }
}


