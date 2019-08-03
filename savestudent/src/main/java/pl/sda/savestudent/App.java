package pl.sda.savestudent;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class App {
    public static void main(String[] args) {


        Student student1 = new Student("Jan", "Kowalski", 1);
        Student student2 = new Student("Anna", "Stocka", 2);
        Student student3 = new Student("Krzysztof", "Krawszyk", 3);
        Student student4 = new Student("Anita", "Małkowska", 4);
        Student student5 = new Student("Janina", "Jura", 5);
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), students);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
