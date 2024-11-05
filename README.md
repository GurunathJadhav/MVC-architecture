# MVC ARCHITECTURE 

The MVC (Model-View-Controller) architecture in Spring Boot is a well-established design pattern used to develop scalable, organized, and maintainable web applications.
MVC separates the application into three main components: Model, View, and Controller, each with distinct responsibilities. Spring Boot’s implementation of MVC, known as Spring Web MVC, 
makes it easy to build RESTful web applications and web pages with minimal boilerplate. Here’s a closer look at each component and how they work in Spring Boot.

# Core Components of MVC Architecture in Spring Boot

  1. Model: Represents the data or business logic of the application. The model is responsible for retrieving, storing, and processing data, usually by interacting with the database or external APIs.
     In Spring Boot, the model is often represented by Java classes, typically annotated with @Entity if they are connected to a database, or with simple POJOs (Plain Old Java Objects).

  2. View: Defines the presentation layer that users interact with. In Spring Boot, views can be templates rendered by technologies like Thymeleaf, JSP, or FreeMarker.
     They display the data passed by the controller in a user-friendly way and respond to user input.

  3. Controller: Handles HTTP requests, processes them, and decides what response or view to return to the user.
     The controller is a Java class annotated with @Controller or @RestController.
     It maps HTTP requests to handler methods, which then interact with the Model to fetch or save data and decide which View should be displayed.

# How MVC Works in Spring Boot

  1. HTTP Request: A client (such as a web browser) sends an HTTP request to the server to request a specific URL.

  2. Controller Processing: The request is received by a @Controller or @RestController class. The controller has methods annotated with @GetMapping, @PostMapping, or other mappings to handle different types of HTTP requests.
     Each method performs specific logic, often with the help of a Service layer to manage business logic.

  3. Model Interaction: The controller may interact with the Model layer (such as services and repositories) to retrieve or update data. This is where the application’s business logic takes place.

  4. Return View or Data: The controller either returns a view name (for web pages) or a JSON response (for REST APIs). If returning a view, the controller adds data to the Model object, which the view can then display.

  5. View Rendering: If the controller returns a view, the View Resolver finds and renders the appropriate template (e.g., Thymeleaf or JSP), displaying the data from the model in a structured, user-friendly format.


# Annotations Used in Spring MVC

  1. @Controller: Indicates that the class is a Spring MVC controller, processing incoming HTTP requests.
  2. @RestController: A specialization of @Controller used for RESTful web services. It combines @Controller and @ResponseBody, making the controller return JSON or XML responses directly instead of rendering a view.
  3. @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Map HTTP GET, POST, PUT, and DELETE requests to controller methods, respectively.
  4. @RequestMapping: A general mapping annotation that can handle any HTTP method.
  5. @PathVariable: Binds a URL path variable to a method parameter.
  6. @RequestParam: Binds a query parameter in the URL to a method parameter.
  7. @ModelAttribute: Binds request parameters to a model object.
  8. @ResponseBody: Used to indicate that a method’s return value should be bound directly to the HTTP response body, usually in REST APIs.

# Advantages of Spring MVC Architecture in Spring Boot

  1. Separation of Concerns: By splitting the application into Model, View, and Controller layers, MVC enforces clear separation of concerns, making the code more maintainable.
  2. Ease of Testing: Since each layer has its own responsibility, it becomes easier to test each part individually.
  3. Modularity and Scalability: With business logic, data handling, and user interface separated, applications become more modular and scalable.
  4. Customizable and Extensible: Spring MVC is highly configurable, allowing you to customize the view technology (e.g., Thymeleaf, JSP, or FreeMarker) and other components.

