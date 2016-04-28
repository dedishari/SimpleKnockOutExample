package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.Logger;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import entity.RegistrationData;

public class RegistrationController extends Controller {

	public Result get() {
		return ok(views.html.register.form.render("Hello"));
	}

	@BodyParser.Of(value = BodyParser.Json.class)
	public Result saveUser() {

		JsonNode regJson = request().body().asJson();
		Logger.info("hello there " + regJson.asText());

		RegistrationData registrationData = Json.fromJson(regJson,
				RegistrationData.class);

		Logger.info("all data " + registrationData.toString());

		registrationData.save();

		return ok("success");

	}
}
