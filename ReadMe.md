This Project Deals with a demo of H2 Data base along with Spring DATA JPA and actuators .


Its a dummy application where we have to expose api which will save data of Student and Teachers working in a school.

We have Tables :

Student:Store student records like id,name, age ,gender,roll number,class,address,teacher id
Teacher:Stores Teacher records like id,name ,age,gender, emp id ,address
Address:Stores Teacher or student address and update the  by Address id column of Student and teacher table.

We would expose an api :

1) Provide students record
2) Provide each Teacher is mapped to how many students
3) Provide address of students based upon id

Actuators end points will be configured .