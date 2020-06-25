# test
### Authentication,

| Name | syntax |definition| data params |
|------|--------|------|----|
|API KEY|apikey|An API key is a token that a client provides when making API calls|"message": "Message Recieved"|

In your HTTP request :
```bash
post http://localhost:3000/test/
-Header
-apikey = 12345
```
Response
```bash
{
    "message": "Message Recieved"
}
```
