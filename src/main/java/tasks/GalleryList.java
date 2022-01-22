/*package tasks;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.HashMap;
import java.util.Map;

public class GalleryList implements Task {

    /*public SearchPhotos(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> params = new HashMap<String, String>();
        params.put("format", "json");
        params.put("nojsoncallback", "1");

        actor.attemptsTo(
                Get.resource("?method=flickr.galleries.getList")
                //Get.resource("?api_key=5f0d2221a085fa8b661905738c5b0526&method=flickr.photos.search&format=json&nojsoncallback=1&text=dog&extras=url_l&page=1")
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .auth().oauth("831cc477ed707aeec312e77126b09ea2","908f30d27b427ad6","72157720828790789-946065b0c37cced0", "0e31a0310b7239aa")
                                .params(params))




        );




    }

    /*public static SearchPhotos searchPhotos(){
        return new SearchPhotos();
    }
}*/
