- Run only unit test: 
Windows: `mvnw.cmd clean test`
Linux/Mac: `./mvnw clean test`

- Run only integration tests(by default end with "IT.java"): 
Windows: `mvnw.cmd clean integration-test -DskipUTs`
Linux/Mac: `./mvnw clean integration-test -DskipUTs`


- Run both unit tests and integration tests: 
Windows: `mvnw.cmd clean install`
Linux/Mac: `./mvnw clean install`


- Run checkstyle: 
Windows: `mvnw.cmd checkstyle:check`
Linux/Mac: `./mvnw checkstyle:check`


- Run findbugs: 
Windows: `mvnw.cmd findbugs:findbugs`
Linux/Mac: `./mvnw findbugs:findbugs`


- Run full local build: 
Windows: `mvnw.cmd clean checkstyle:check findbugs:findbugs install`
Linux/Mac: `./mvnw clean checkstyle:check findbugs:findbugs install`