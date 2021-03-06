package integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.present;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

class ElementHiddenTest extends IntegrationTest {
  @BeforeEach
  void clickRemovesElement() {
    openFile("elements_disappear_on_click.html");
    $("#hide").click();
  }

  @Test
  void shouldBeHidden() {
    $("#hide").shouldBe(hidden);
  }

  @Test
  void shouldDisappear() {
    $("#hide").should(disappear);
  }

  @Test
  void waitUntilDisappears() {
    $("#hide").waitUntil(disappears, 2000);
  }

  @Test
  void shouldNotBeVisible() {
    $("#hide").shouldNotBe(visible);
  }

  @Test
  void shouldBePresent() {
    $("#hide").shouldBe(present);
  }

  @Test
  void shouldExist() {
    $("#hide").should(exist);
  }

  @Test
  void shouldNotAppear() {
    $("#hide").shouldNot(appear);
  }
}
