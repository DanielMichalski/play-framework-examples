package controllers;

import models.Movie;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Play framework app"));
    }

    public static Result add(Integer x, Integer y) {
        return ok(String.format("%d + %d = %d", x, y, (x + y)));
    }

    public static Result addMovie() {
        Movie movie = Form.form(Movie.class).bindFromRequest().get();
        movie.save();
        return redirect(routes.Application.getMovies());
    }

    public static Result getMovies() {
        return ok(movies.render(Movie.find.orderBy("title").findList()));
    }
}
