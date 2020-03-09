$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/categories.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User can navigate to correct category page,",
  "description": "  So that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"\u003ccategory\u003e\" link from top menu",
  "keyword": "When "
});
formatter.step({
  "name": "user should able to navigate to \"\u003crelated category paged\u003e\" successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "related category paged"
      ]
    },
    {
      "cells": [
        "Computers",
        "https://demo.nopcommerce.com/computers"
      ]
    },
    {
      "cells": [
        "Electronics",
        "https://demo.nopcommerce.com/electronics"
      ]
    },
    {
      "cells": [
        "Apparel",
        "https://demo.nopcommerce.com/apparel"
      ]
    },
    {
      "cells": [
        "Digital downloads",
        "https://demo.nopcommerce.com/digital-downloads"
      ]
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
  "name": "user us on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userUsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  So that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Computers\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userClicksOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/computers\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
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
  "name": "user us on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userUsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  So that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Electronics\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userClicksOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/electronics\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
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
  "name": "user us on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userUsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  So that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Apparel\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userClicksOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/apparel\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
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
  "name": "user us on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userUsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  So that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user clicks on \"Digital downloads\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userClicksOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/digital-downloads\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});