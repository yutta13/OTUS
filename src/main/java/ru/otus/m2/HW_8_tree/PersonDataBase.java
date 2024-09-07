package ru.otus.m2.HW_8_tree;
import java.util.Map;

public class PersonDataBase {
    private final Map<Long, Person> personData;
    public PersonDataBase(Map<Long, Person> personData) {
        this.personData = personData;
    }

    public Person findById(Long id) {
       return personData.get(id);
    }

    public void add(Person person){
        personData.put(person.getId(), person);
    }

    public boolean isManager(Person person) {//- O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
    return person.getPosition().equals(Position.MANAGER)||
            person.getPosition().equals(Position.DIRECTOR)||
            person.getPosition().equals(Position.BRANCH_DIRECTOR)||
            person.getPosition().equals(Position.SENIOR_MANAGER);
    }

    public boolean isEmployee(Long id) {//-isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position
       Person person = findById(id);
       return !isManager(person);
    }
}
/*
и имеющий методы, со следующей асимптотической сложностью (методы и конструктор класса Person реализовать самостоятельно)

- Person findById(Long id) - найти Person по id - O(1)
- void add(Person person) - добавить Person - O(1)
- isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
- isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position

*/