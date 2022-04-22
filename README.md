#mercadolibre-test

###Environment requirements
* Java 11+
* Chrome or Firefox browser.
* Gradle.

###Run automated tests
You can use the following command to execute the automated tests:
By default it will be run in Chrome.

```shell script
.\gradlew clean runFeatures
```

###Configuration
Please see as example the config.json.dist and create a new config.json file
Don't forget to create two accounts as Instructor and one account as Student

* "browser" -> you can specify the following values {"chrome", "firefox", "headless"}

Configuration example:
```shell script
  "browser": "chrome"
```
