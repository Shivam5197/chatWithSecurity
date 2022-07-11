# chatWithSecurity

Chat: https://medium.com/javarevisited/building-persistable-one-to-one-chat-application-using-spring-boot-and-websockets-303ba5d30bb0

Security: https://www.codejava.net/frameworks/spring-boot/spring-boot-security-role-based-authorization-tutorial


Columns:
Doctor:
String FullName
String Department
Integer Experience
Integer Starting From $
String Work_Details
Integer Gender
String PhoneNumber
String email
Integer role {Admin,TeamLead,Physio}

docRating
Integer Rating
String feedback

User:
String Full Name
Integer Gender
String Area
String City
String address
String problems
String PhoneNumber
String email
String TreatmentProvided
String TreatmentDuration


UserDoctorRelation:
userId
DoctorId
