# dockerizing-spring-mysql-demo
Using Docker to containerize a simple Spring Boot application with MySQL database

You will need:
- IntelliJ IDEA (recommended)
- Docker
- Local MySQL server (optional)

How to run:
- Open terminal and navigate to where you want to clone the repository.
- Type: <code>git clone https://github.com/ttheconjuring/dockerizing-spring-mysql-demo.git</code>
- Run MySQL server with user 'root' and password '1234' (Use either local server or containerize one)
- Open the project folder with IntelliJ, then type: <code>mvn install</code> or <code>./mvnw install</code>
- Stop the running MySQL server
- Start Docker and type: <code>docker-compose up</code>
