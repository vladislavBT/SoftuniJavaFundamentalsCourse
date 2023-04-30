package JavaFundamentalsMapsExercise;
import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();

        Map <String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("end")){
            String []arr=command.split(" : ");

            String nameOfCourse= arr[0];
            String nameOfPerson=arr[1];


            if(map.containsKey(nameOfCourse)) {
                List<String> coursesPersons= map.get(nameOfCourse);
                coursesPersons.add(nameOfPerson);
                map.put(nameOfCourse, coursesPersons);
            }
            else{
                List<String> firstPersonList = new ArrayList<>();
                firstPersonList.add(nameOfPerson);
                map.put(nameOfCourse,firstPersonList);
            }
            command= scanner.nextLine();

        }

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {

                System.out.println(entry.getKey() + ": " + entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println("-- " + entry.getValue().get(i));
                }


            }



    }}
