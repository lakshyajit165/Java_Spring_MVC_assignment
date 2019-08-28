# Java_Spring_MVC_assignment

- Create a simple java maven web app (archetype webapp) project using IDE (you can use any of eclipse, STS, intellij)
- JAVA project should have groupId, artifact, package named appropriately, follow reverse domain naming convention
- Compile, Package, Test from terminal using maven, resolve any issue if exists
- Add required dependencies in pom.xml , also verify the packaging to be a WAR (Web Archive)
- Using <strong>Spring MVC</strong>, create a form which with fields Event title, City, Ticket Price and Event Type, Event type will be drop down
  - NOTE: Event type should be a dropdown and should have values (Cricket, Football, Badminton) and these values should come from Controller and should not be hardcoded in view.
- The form should have a <strong>Submit button which on clicking should route to a new view which displays all registered events, along with the newly registered event also</strong>.
- Use <strong>Annotation</strong>, <strong>Autowire</strong>, <strong>Spring MVC concepts</strong>.
- Use tomcat 8 or 9 to run the application
