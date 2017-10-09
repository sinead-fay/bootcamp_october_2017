package controllers

import play.api.mvc.{Action. Controller}

/**
 * Created by sinead on 27/09/17.
 */
public class WelcomeController extends Controller {
  def welcome () = Action {
    Ok
  }
}
