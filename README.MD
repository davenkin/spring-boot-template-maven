- Run only unit test: 
`mvn clean test`


- Run only integration tests(by default end with "IT.java"): 
`mvn clean integration-test -DskipUTs`


- Run both unit tests and integration tests: 
`mvn clean install`


- Run checkstyle: 
`mvn checkstyle:check`


- Run findbugs: 
`mvn findbugs:findbugs`


- Run full local build: 
`mvn clean checkstyle:check findbugs:findbugs install`