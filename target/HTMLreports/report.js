$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the google search functionality is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleStepDefination.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDefination.user_is_on_google_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the text in search box",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleStepDefination.user_enters_the_text_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hits enter",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDefination.user_hits_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to search results",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDefination.user_is_navigated_to_search_results()"
});
formatter.result({
  "status": "passed"
});
});