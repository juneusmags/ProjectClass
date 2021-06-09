public class ProjectClassTest{
    public static void main(String[] args){
        ProjectClass personOne = new ProjectClass("Juju", "Amazing Dancer");
        ProjectClass personTwo = new ProjectClass("Tom", "Amazing Soccer Player");
        System.out.println(personOne.getName());
        System.out.println(personOne.getDescription());
        personOne.setName("June");
        System.out.println(personOne.getName());
    }
}