# CookWithUs
Cook with us repository where we will push all the updated code in this sphere.

Technologies:

IntelliJ IDEA (ultimate)
Java 17 SDK
Gradle
Spring Boot framework 3.0.1
Project JDK name "corretto-17"

Launch:

Open XAMPP and push the button START for the two servers that we will be needing:
1. MySQL Database
2. Apache Web servers

In the folder that is posted, it firstly has to be unzipped and then open it with IntelliJ. If you want to test the database, you have to open PhpMyAdmin and test it there by creating a database and then paste the file there.

Testing:

The application is testable through Insomnia : http://localhost:8081

Description of the project: 

MakeupClasses is a project that we created for Makeup Classes with the aim that each person can have the opportunity to follow their favorite makeup artist. A makeup class is a course of teaching in the application of make-up. This app gives the opportunity to book a class for anyone who wants to become a professional makeup artist in the future. In the end of a certain class everyone gets a special gift.

Classes:

The project has 7 classes.
Their titles are:
1. Client
2. Room
3. Lesson
4. Realization
5. Seat
6. Booking
7. Gift

All of these classes are divided into 4 packages, which they are: controller, pojo, repository, service.

The SQL database that we created has 7 entities:

1. Client
   *ClientName
   *ClientSurname
   *ClientEmail

2. Lesson
   *LessonName
   *LessonCategory

3. Realization
   *RLessonName
   *RRoomNr
   *RealizationTime

4. Room
   *RoomNumber
   *RoomCapacity

5. Seat
   *SeatNumber
   *RoomNumber

6. Booking
   *BookingNr
   *BookingDate
   *BookingTime
   *BClientName
   *BLessonName
   *BookingSeatNr

7. Gift
   *Products
   *GClientName
   *GLessonName
   *GBookingNr

Important Dependencies:

-- Spring Boot starter data jpa
1. implementation 'org.springframework.boot:spring-boot-starter-data-jpa'

-- Spring Boot starter web
2. implementation 'org.springframework.boot:spring-boot-starter-web'

-- MySQL Connector
3. runtimeOnly 'com.mysql:mysql-connector-j'

-- Spring Boot starter test
4. testImplementation 'org.springframework.boot:spring-boot-starter-test'

-- H2 Database
5. runtimeOnly 'com.h2database:h2'

This application is testable through Insomnia.
Every class of this project has: GET, POST, PUT, DELETE mapping.

Endpoints:


//
GET mapping (ROOM):
localhost:8081/room

(GET: by their numbers)
localhost:8081/room/number

POST mapping (ROOM):

localhost:8081/room

PUT mapping (ROOM):

localhost:8081/room/number

DELETE mapping (ROOM):

localhost:8081/room/number

//
GET mapping (CLIENT):
localhost:8081/client/bookings

(GET: by their names)
localhost:8081/client/name

POST mapping (CLIENT):
localhost:8081/client

PUT mapping (CLIENT):
localhost:8081/client/name

DELETE mapping (CLIENT):
localhost:8081/client/name


//
GET mapping (LESSON):
localhost:8081/lesson/bookings

(GET: by their names)
localhost:8081/lesson/name

POST mapping (LESSON):
localhost:8081/lesson

PUT mapping (LESSON):
localhost:8081/lesson/name

DELETE mapping (LESSON):
localhost:8081/lesson/name


//
GET mapping booked (SEAT):
localhost:8081/booked/seats

(GET: by their data)
localhost:8081/seats

(GET: by their name)
localhost:8081/seat/number

POST mapping (SEAT):
localhost:8081/seat

PUT mapping (SEAT):
localhost:8081/seat/number

DELETE mapping (SEAT):
localhost:8081/seat/number


//
GET mapping (REALIZATION):
localhost:8081/realization

(GET: by their data and time)
localhost:8081/realization/data/time

POST mapping (REALIZATION):
localhost:8081/realization

PUT mapping (REALIZATION):
localhost:8081/realization/time

DELETE mapping (REALIZATION):
localhost:8081/realization/time


//
GET mapping (BOOKING):
localhost:8081/booking

(GET: the data by the id)
localhost:8081/booking/nr

POST mapping (BOOKING):
localhost:8081/booking

PUT mapping (BOOKING):
localhost:8081/booking/nr

DELETE mapping (BOOKING):
localhost:8081/booking/nr

//
GET mapping (GIFT):
localhost:8081/gift

(GET: the data by the id)
localhost:8081/gift/product

POST mapping (GIFT):
localhost:8081/gift

PUT mapping (GIFT):
localhost:8081/gift/product

DELETE mapping (GIFT):
localhost:8081/gift/product# SEProject
# SEProject