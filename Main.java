import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student nisanur = new Student(
            UUID.randomUUID(),           // id
            "220504013",                 // studentNo
            "12345678901",               // nationalId (ornek)
            "Nisanur",                   // firstName
            "Gökalp",                    // lastName
            new Date(103, 0, 11),        // birthDate (11 Ocak 2003)
            Gender.FEMALE,               // gender
            "nisanur@example.com",       // email
            "5551234567",                // phone
            "İstanbul",                  // address
            UUID.randomUUID(),           // programId (ornek)
            2022,                        // enrollmentYear
            4,                           // classYear 
            Status.ACTIVE,               // status
            "http://example.com/photo.jpg", // photoUrl
            new Date()                   // createdAt
        );

        studentList.add(nisanur);

        System.out.println("--- Student Information System ---");
        System.out.println("Registered Students:");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}