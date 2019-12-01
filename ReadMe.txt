
Tool Used to build the application :- Spring STS IDE
Framework - Spring Boot
Used JPA Specification to implement ORM. 
Database - Derby Database (Embedded)
Server - Apache Tomcat (Embedded ) 


Guidelines :

USER ENTITY :

URLs: 
Create user  : /users
Get all user :/users
Get user by Id : /user/{userId}

API Implementation : UserProfileService.java , UserProfileController.java
Crud Repository    : UserProfileRepository.java


BASKET ENTITY :

OneToOne Mapping with Users


URLs:
Create Basket : /users/{userId}/baskets
Get all Baskets  : /users/baskets/
Get Basket by user ID : /users/{userId}/baskets
delete basket : /users/{userId}/baskets/{id}

Entity Class : Basket.java
API Implementation : BasketService.java , BasketController.java
Crud Repository : BasketRepository.java


BASKETITEM ENTITY :

ManyToOne Mapping with Baskets

URLs:
Add Items to Basket : /baskets/{basketId}/items
Remove Items from Basket : /baskets/{basketId}/items/{productId}
Get All items from Basket : /baskets/{basketId}/items

Entity Class : BasketItem.java
API Implementation : BasketItemService.java , BasketItemController.java
Crud Repository : BasketItemRepository.java


PRODUCT ENTITY : 

OneToOne Mapping with BasketItem

URLs:
Add Products : /products
Get all products : /products

Entity Class : ProductMaster.java
API Implementation : ProductService.java , ProductController.java
Crud Repository : ProductRepository.java





 