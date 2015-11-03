package controllers;

import models.Person;
import play.data.Form;
import play.*;
import play.mvc.*;
import play.db.ebean.Model;
import views.html.*;

import java.util.List;
import static play.libs.Json.toJson;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hello World"));
    }
    
    public Result addPerson() {
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());
    }

    public Result getPersons() {
        List<Person> persons = new Model.Finder( String.class, Person.class).all();
        return ok(toJson(persons));
    }

    public Result blog() { return ok(blog.render()); }

}
