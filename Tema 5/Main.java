import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Unemployed("John", 20));
        people.add(new Employee("Ronald", 31));
        people.add(new Student("Antonio", 21));
        people.add(new Employee("McGonagall", 41));
        people.add(new Student("Stephan", 27));

//______________________________________________________________________________________________________________________
//
        // Displaying the values after iterating through the list
        Iterator it = people.iterator();
        System.out.println("The persons from your list are: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("____________________________________________________");

        Set<Person> peopleByName = new TreeSet<>(new NameComparator());
        peopleByName.addAll(people);
        // Displaying the values after iterating through the set
        Iterator it1 = peopleByName.iterator();
        System.out.println("The persons sorted by name are: ");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("____________________________________________________");

        Set<Person> peopleByAge = new TreeSet<>(new AgeComparator());
        peopleByAge.addAll(people);
        Iterator it2 = peopleByAge.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The persons sorted by age are: ");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
//______________________________________________________________________________________________________________________
//
        Address address1 = new Address("Austria", "Igls", "IglsStrasse");
        Address address2 = new Address("Switzerland", "Verbier", "St.Verbier");
        Address address3 = new Address("France", "Tignes", "Val-d'Isere");

        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Ski", 5, address1, address2, address3);
        Hobby hobby2 = new Hobby("Swimming", 6, address2, address3);
        Hobby hobby3 = new Hobby("Jogging", 7, address1, address2);
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);
        //Creates new HashMap with two parameters, Person and List of hobbies
        Map<Person, List<Hobby>> hobbyOfPerson = new HashMap<>();
        hobbyOfPerson.put(people.get(0), hobbyList);

        System.out.println("____________________________________________________");
        System.out.println("The hobbies of " + people.get(0).getName() + " are: ");
        // Prints the hobbies of a certain person and the address of places where these can be practiced
        for (Object value : hobbyOfPerson.values()) {
            System.out.println(value);
        }
    }
}

