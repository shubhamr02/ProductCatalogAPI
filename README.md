# ProductCatalogAPI

**API**

  `/api/products`
  
  Fetches list of products from the server in the JSON form.
  
  `api/add`
  
  Adds a new product to the product database.
  
  
**Steps by step guide to run code**

  Create a five entries in mongoDB database
  `
  | Product ID | Product Name|Product Type|	Product Category |	Product Price |
  |------------|-------------|------------|------------------|----------------|
  | 1001	     |Lenovo Yoga  |	Laptop    |	Electronics      |	45000         |
  | 1002	     |LG Washing   | Machine Washing| Machine	|Home | Appliances	25000
  | 1003	     |HP Pavilion 360	| Laptop	| Electronics	|60000
  | 1004	     |US Polo Assn	|T-Shirt|	Clothing|	1200
  | 1005	     |Neelkamal Been Bag|	Sofa Set|	Furniture|	350
  `
  
  **Starting server**
  
  
    Use git pull to get code from repository to local repo. 
    Open Eclipse or IntelliJ IDEA.
    Select open existing project. In case of eclipse select gradle project.
    Click next and finish.
    Build and clean the project.
    Run the main spring application file.
    
    
    **Modify application.properties**
    
    #Local MongoDB config
    spring.data.mongodb.database=Your_Database_Name
    spring.data.mongodb.port=27017
    spring.data.mongodb.host=localhost

    # App config
    server.port=8888
    
  
    
