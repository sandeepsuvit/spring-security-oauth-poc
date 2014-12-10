Spring-security-oauth-poc
========================

This is a POC showcasing Spring's integration with OAUTH

The following process describes how to run this application

###Step 1
This step describes how to access the service. When we directly hit the protected service
we get an unauthorized access output from the service. This is provided by our configured
oauth api.

#####INIPUT
```sh
http://localhost:8080/security-poc/api/getListOfEmployees.json
```
#####OUTPUT
```sh
{
	error: "unauthorized"
	error_description: "An Authentication object was not found in the SecurityContext"
}
```
	
###Step 2
In this step we request the oauth service to provide us with an access_token to access our 
underlying service layer that is getListOfEmployees. This is obtained by passing in few 
parameters as shown in the url below.

#####INPUT
```sh
http://localhost:8080/security-poc/oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username=sandeep&password=123
```

#####OUTPUT
```sh
{
	access_token: "4f09fa81-d3da-41c4-9a7d-eacaef531c72"
	token_type: "bearer"
	refresh_token: "2e317a4a-7413-4d9f-a995-7b50aef50786"
	expires_in: 119
}
```

###Step 3
Once we obtain the access_token its time we get our service with that. Notice that the 
the time for the access_token to expire is 119ms. So we need to access it before that. 
The link below shows how to access our service using the access_token that we got
from the step above.

#####INPUT
```sh
http://localhost:8080/security-poc/api/getListOfEmployees.json?access_token=4f09fa81-d3da-41c4-9a7d-eacaef531c72
```

#####OUTPUT
```sh
{
	"employees": [
			{
	            "empName": "Sandeep",
	            "empEmail": "sandeep@mail.com",
	            "empSalary": "1222"
	        },
	        {
	            "empName": "Rupam",
	            "empEmail": "rupam@mail.com",
	            "empSalary": "1333"
	        }
    	]
}
```
