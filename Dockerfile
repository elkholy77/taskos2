FROM openjdk
WORKDIR /app
COPY Calculator.java .
RUN javac Calculator.java
CMD java Calculator
