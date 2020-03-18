$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/checkHooveringInCategories.feature");
formatter.feature({
  "name": "As User I can use hoover facilities on category",
  "description": "   So that I can use hoover facilities successfully",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hover"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Nopcommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userIsOnTheNopcommerceHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I should able to use hoover facilities",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hover"
    }
  ]
});
formatter.step({
  "name": "I hover over on category \"Electronics\" link",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.iHoverOverOnCategoryLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to see related \"Electronics\" link text color change to blue",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.iShouldAbleToSeeRelatedLinkTextColorChangeToBlue(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Nopcommerce homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userIsOnTheNopcommerceHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I should able to navigate to subcategory page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hover"
    }
  ]
});
formatter.step({
  "name": "I hover over \"Electronics\"  link and click on subcategory \"Camera \u0026 photo\" link",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.iHoverOverLinkAndClickOnSubcategoryLink(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to navigate to sub category  \"camera-photo\" page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.iShouldAbleToNavigateToSubCategoryPageSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});