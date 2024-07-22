# percy-java-demo
STEP 1

Create a Percy project
Sign in to Percy. In Percy, create a project of the type, Web, and then name the project. After the project is created, Percy generates a token. Make a note of it. You have to use it set your environment variable in the next step.

For details on creating a project, see [Create a Percy project](https://www.browserstack.com/docs/percy/integrate-bstack-sdk/java#Percy_SDK).

STEP 2 

Openn terminal and hit (mvn install) 

STEP 3

Set the project token as an environment variable
Run the given command to set PERCY_TOKEN as an environment variable:

Windows CMD
Copy snippet
set PERCY_TOKEN="<your token here>"

STEP 4

Install Percy dependencies
Install the following components to establish the integration environment for your test suite.

Copy snippet
npm install --save-dev @percy/cli

STEP 5

Hit command 

npx percy exec -- mvn test -P sample-test

for more info please reffer 

https://www.browserstack.com/docs/percy/integrate-bstack-sdk/java#Percy_SDK

