FROM eclipse-temurin:17.0.7_7-jdk

WORKDIR /app

COPY target/ProjectHarbourBooking-1.0.0.jar harbour-booking-api.jar

CMD ["java", "-jar", "harbour-booking-api.jar"]

