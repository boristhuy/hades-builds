# Setup

## Prerequisites

1. Install `java 11`
2. Install `aws-sam-cli`. See https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html

## Local development

### Installing dependencies

We use `Maven` to install dependencies and package our application into a JAR file:

`mvn clean install`

### Invoking Lambda function locally through local API Gateway

1. Package application with `mvn package`
2. Start the SAM local API with `sam local start-api`

If the previous command ran successfully you should now be able to hit the following local endpoint to invoke the Lambda functions.

SAM CLI is used to emulate both Lambda and API Gateway locally and uses our template.yaml to understand how to bootstrap this environment (runtime, where the source code is, etc.).

## Packaging and deployment
