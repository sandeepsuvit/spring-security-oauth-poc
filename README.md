Spring-security-oauth-poc
========================

This is a POC showcasing Spring's integration with OAUTH

The following process describes how to run this application

Step 1
------
INIPUT:
	http://localhost:8080/security-poc/api/getListOfEmployees.json
	
OUTPUT:
	{
		error: "unauthorized"
		error_description: "An Authentication object was not found in the SecurityContext"
	}
	
	
Step 2
------
INPUT:
	http://localhost:8080/security-poc/oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username=sandeep&password=123

OUTPUT:
	{
		access_token: "4f09fa81-d3da-41c4-9a7d-eacaef531c72"
		token_type: "bearer"
		refresh_token: "2e317a4a-7413-4d9f-a995-7b50aef50786"
		expires_in: 119
	}


Step 3
------
INPUT:
	http://localhost:8080/security-poc/api/getListOfEmployees.json?access_token=4f09fa81-d3da-41c4-9a7d-eacaef531c72

OUTPUT:
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