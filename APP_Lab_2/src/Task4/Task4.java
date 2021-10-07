package Task4;

import Task3.*;

import java.util.*;

public class Task4
{
    public static void main(String[] args) {
        final var sb_phythics = new Subject("Фізика");
        final var sb_english = new Subject("Англійська мова");
        final var sb_math = new Subject("Математика");

        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                sb_phythics,
                sb_english,
                sb_math
        ));

        var studentList = new StudentList(subjects, new Student[] {
                new Student("AAAAAA", "Serhii", "Stepanchuk", "Tarasovych", 'A', 11, new HashSet<Mark>(Arrays.asList(
                        new Mark(80, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                ))),
                new Student("BBBBBB","Maria", "Gryziak", "Lybomirivna", 'B', 10, new HashSet<Mark>(Arrays.asList(
                        new Mark(89, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                ))),
                new Student("CCCCCC","Andrii", "Sobor", "Vasylivych", 'B', 11, new HashSet<Mark>(Arrays.asList(
                        new Mark(99, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                )))
        });

        System.out.println(studentList);

        studentList.addSubjectWithMarks(new Subject("Географія"), Map.of(
                "AAAAAA", 80,
                "BBBBBB", 90,
                "CCCCCC", 100)
        );

        System.out.println("\nAfter add new subject: ");
        System.out.println(studentList);

        System.out.println("\nBest student: ");
        System.out.println(studentList.getBestStudent());

        System.out.println("\nPhysic marks: ");
        for (var entry : studentList.getStudentsMarksBySubject(sb_phythics).entrySet())
            System.out.println(entry.getKey() + ":" + entry.getValue());

    }
}
