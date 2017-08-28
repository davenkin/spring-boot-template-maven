run only unit test: `mvn clean test`

run only integration tests(by default end with "IT.java"): `mvn clean integration-test -DskipUTs`

run both unit tests and integration tests: `mvn clean install`

run checkstyle: `mvn checkstyle:check`

run findbugs: `mvn findbugs:findbugs`

run full local build: `mvn clean checkstyle:check findbugs:findbugs install`