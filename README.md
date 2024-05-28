## About
API built using Java, Java Spring and AWS Simple Email Service for the [Uber Email Service Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).<br/>
The aim of this project is to practice Java and Spring Framework with Clean Architecture concepts. 

<div style="display: inline_block">
    <img align="center" alt="Java" title="Java" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
    <img align="center" alt="Spring" title="Spring" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
    <img align="center" alt="AWS" title="AWS" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/amazonwebservices/amazonwebservices-original-wordmark.svg">
</div>
<br/>

## E-mail service Uber challenge
<h4> 
    🚧 Under development 🚧
</h4>
<br/>

## Installation

1. Clone the repository:

```bash
git clone https://github.com/danvinicius/email-service-uber-challenge.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
spring.application.name=email-service
server.port=8081

aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111

api.email.request.sourceEmail=your-source-email
```

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8081

## Endpoints

### 1. Sends an e-mail to someone

#### Endpoint: POST /api/email

Request:
```http
POST /api/email
Content-Type: application/json

{
    "to": "someone@mail.com",
    "subject": "subject of the e-mail",
    "body": "body of the e-mail"
}
```

Response:
```text
E-mail sent successfully
```

#### Error:
An error may occur if AWS credentials are not valid.

Response:
```text
Error while sending e-mail
```

<br/>
Install <a href="https://git-scm.com/">GIT</a> and <a href="https://www.java.com/pt-BR/">Java</a> on your computer.
