package Task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task3
{
    public static void main(String[] args) {
        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                new Subject("Фізика"),
                new Subject("Англійська мова"),
                new Subject("Математика")
        ));

        final var sb_phythics = subjects.stream().filter(el -> el.getName() == "Фізика").findFirst().get();
        final var sb_english = subjects.stream().filter(el -> el.getName() == "Англійська мова").findFirst().get();
        final var sb_math = subjects.stream().filter(el -> el.getName() == "Математика").findFirst().get();

        final Set<Student> students = new HashSet<Student>(Arrays.asList(
                new Student("AAAAAA", "Serhii", "Stepanchuk", "Tarasovych", 'A', 11, new HashSet<Mark>(Arrays.asList(
                        new Mark(80, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                ))),
                new Student("BBBBBB","Maria", "Gryziak", "Lybomirivna", 'B', 10, new HashSet<Mark>(Arrays.asList(
                        new Mark(80, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                ))),
                new Student("CCCCCC","Andrii", "Sobor", "Vasylivych", 'B', 11, new HashSet<Mark>(Arrays.asList(
                        new Mark(80, sb_phythics),
                        new Mark(100, sb_english),
                        new Mark(90, sb_math)
                )))
        ));

        for (var student : students)
        {
            System.out.println(student);
        }
    }
}
