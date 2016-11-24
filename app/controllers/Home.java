package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import javax.naming.directory.SearchResult;
import java.util.ArrayList;
import java.util.List;
import views.html.*;

public class Home extends Controller {
		
	public Result index() {
		return ok(views.html.Home.render());	
	}

}
