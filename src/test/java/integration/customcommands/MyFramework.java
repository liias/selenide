package integration.customcommands;

import java.util.concurrent.atomic.AtomicInteger;

import com.codeborne.selenide.commands.Commands;
import com.codeborne.selenide.impl.ElementFinder;
import org.openqa.selenium.By;

public class MyFramework {
  static AtomicInteger tripleClickCounter = new AtomicInteger();
  static AtomicInteger quadrupleClickCounter = new AtomicInteger();

  public static void setUp() {
    Commands.getInstance().add("tripleClick", new TripleClick());
    Commands.getInstance().add("quadrupleClick", new QuadrupleClick());
  }

  /**
   * Replacement for standard Selenide `$` method.
   *
   * @param selector CSS selector
   *
   * @return MySelenideElement - an "advanced" version of `SelenideElement` with more custom methods
   */
  public static MySelenideElement $_(String selector) {
    return ElementFinder.wrap(MySelenideElement.class, null, By.cssSelector(selector), 0);
  }
}
