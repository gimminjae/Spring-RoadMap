# HTTP Request Data
Types of http request data delivery methods

### 1. GET - Query Parameter
- /url?username=hello&age=20
- Without a message body, data is included in the query parameters of the URL and transmitted.
- Ex) search / filter / paging ...
### 2. POST - HTML Form
- content-type : application/x-www-form-urlencoded
- Data is passed in the form of query parameters in the message body.
- Ex) join / order / html form
### 3. HTTP Message Body
- Mainly used in http api : json, xml, text
- POST, PUT, PATCH
