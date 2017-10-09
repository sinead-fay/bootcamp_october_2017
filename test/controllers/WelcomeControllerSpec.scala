package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.test.FakeRequest
import play.api.test.Helpers._
/**
 * Created by sinead on 27/09/17.
 */
public class WelcomeControllerSpec extends PlaySpec with GuiceOneAppPerTest {

  "WelcomeController GET" should {
    "return a successful responce" in {
      val controller = new WelcomeController
      val result = controller.welcome.apply(FakeRequest())
      status(result) mustBe OK
    }
  }

  "respond to the /welcome url" in {
    val request = FakeRequest(GET, "/welcome").withHeaders("Host" -> "localhost")
    val home = routes(app, request).get
    status(home) mustBe OK

  }
}


