# codingexample
Coding example of RESTful service

A Restful Web API that implements a To Do list.  Base functionality should be:

- Add a new “To Do Item” using a POST
- Update an existing “To Do Item” using a Patch
- Return a single “To Do Item” using a GET
- Return a list of “To Do Items” using a GET

 

The base “To Do” object is defined as a JSON object with the following fields

- Title
- Description
- Due Date (Date and Time)

 

User Stories:

- As a user, I want to call a service endpoint that returns a list of To Do items

    - Acceptance Criteria:

        - Done when a GET returns a list of To Do items in JSON format

- As a user, I want to call a service endpoint that returns the details of a single To Do item

    - Acceptance Criteria: 

        - Done when a GET for a valid To Do item ID returns Title, Description and Due Date in JSON format
        - Done when a GET for a To Do item ID that doesn’t exist returns an HTTP 404 status code

- As a user, I want to call a service endpoint that updates a single To Do item

    - Acceptance Criteria: 

        - Done when a PATCH to an existing item updates the Title, Description and/or Due Date
        - Done when a PATCH to a non-existent To Do Item returns an HTTP 404 status code

- As a user, I want to call a service endpoint that creates a new To Do item

    - Acceptance Criteria: 

        - Done when a successful POST that includes Title, Description and Due Date returns an HTTP 201 status
        - Done when a successful POST returns the created object
        - Done when an unsuccessful POST due to any reason returns an HTTP 400 status

 

**Other Requirements:**

Create this in Java. You may use the Spring Framework and Springboot to simplify implementation.

Though we appreciate the knowledge of packages such as Spring Data REST (spring-boot-starter-data-rest) please avoid using such technologies
 in favor of a from scratch implementation of the utility.

Database persistence is not required, data can be stored in memory if it simplifies your implementation.

Commit the application to a GitHub repo

Write at least one unit test, using the unit testing framework of your choice for at least one POST, PATCH and GET method

Write
 at least one integration test for at least POST, PATCH and GET method. 
 You may do this in PostMan, a unit test framework or other tool
 of your choice

Spend
 1-2 hours on this and commit your changes to GitHub. Incomplete 
implementation is okay, but focus on a specific user story being 
complete. 
 For instance, I would prefer to see only one method implemented along 
with the associated unit and integration tests than all methods, but no 
tests.Prioritize
 for usability.  If implementation is incomplete; ensure that what is 
completed is demonstrable. The tests may be an easy way to
 drive demonstration.
