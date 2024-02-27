# Online Food App
## Introduction
This is a full-stack project about developing an online food ordering system based on Spring boot and React. The app is further deployed on AWS (the link to the web service: https://je6kigmgk2.us-east-2.awsapprunner.com/). Main functions of the app include:
- User registration
- Restaurant menu search
- Add menu items to the shopping cart
- Checkout

## Design
![Design diagram](./Diagram.png)
Overall, the app consists of three layers: the controller layer, the service layer and the repository layer. 
- Controller layer: it is designed to handle all the incoming HTTP requests, calling the corresponging downstream service APIs based on the requests.
- Service layer: it implements all the service logics, for example, the signing up of a new user.
- Repository layer: it takes care of the manipulation of the data based on a PostgreSQL database.
