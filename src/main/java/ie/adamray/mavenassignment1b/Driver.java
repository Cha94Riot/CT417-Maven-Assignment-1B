/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.adamray.mavenassignment1b;

import ie.adamray.mavenassignement1a.*;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Driver {
    
// Declares Test varialbles
    private static CourseProgramme CS, eng, math, phy;
    private static Module CT1, CT2, MA1, TH1, PHY1, AI1;
    private static Student Adam, Ryan, Jack, Lisa, Paul, Mary, Dee;
    
    public static void main(String[] args) {
        initialiseCourses();
        initialiseModules();
        modulesToCourses();
        registerStudents();
        
        listModules(CS);
        listModules(eng);
        listModules(math);
        listModules(phy);
        
        studentInfo(Adam);
        studentInfo(Ryan);
        studentInfo(Jack);
        studentInfo(Lisa);
        studentInfo(Paul);
        studentInfo(Mary);
        studentInfo(Dee);

    } 

    private static void initialiseCourses() {
        // Creates new Courses with Code and Dates
        CS = new CourseProgramme("BCT1", 10, 9, 2018, 15, 5, 2019);
        eng = new CourseProgramme("ENG1", 10, 9, 2018, 15, 5, 2019);
        math = new CourseProgramme("MATH1", 10, 9, 2018, 15, 5, 2019);
        phy = new CourseProgramme("PHY1", 10, 9, 2018, 15, 5, 2019);
    }

    private static void initialiseModules() {
        // Creates new Modules with Name and ID, then adds them to a Course Object
        CT1 = new Module("Programming", "CT1");
        CT2 = new Module("Software Engineering", "CT2");
        MA1 = new Module("Math", "MA1");
        TH1 = new Module("Thermodynamics", "TH1");
        PHY1 = new Module("Physics", "PHY1");
        AI1 = new Module("Artificial Intelligence", "AI1");
    }

    private static void modulesToCourses() {
        // Populates courses with modules
        CS.addModules(CT1);
        CS.addModules(CT2);
        CS.addModules(AI1);
        math.addModules(MA1);
        math.addModules(CT1);
        eng.addModules(CT1);
        eng.addModules(MA1);
        eng.addModules(TH1);
        eng.addModules(PHY1);
        phy.addModules(MA1);
        phy.addModules(TH1);
        phy.addModules(PHY1);
        
    }

    private static void registerStudents() {
        // Creates a new Student with Name, DOB and course
        Adam = new Student("Adam", 18, 8, 1995, CS);
        Ryan = new Student("Ryan", 3, 1, 1999, eng);
        Jack = new Student("Jack", 9, 9, 1996, phy); 
        Lisa = new Student("Lisa", 29, 6, 1999, math);
        Paul = new Student("Paul", 18, 3, 2000, eng);
        Mary = new Student("Mary", 2, 10, 1998, math); 
        Dee = new Student("Dee", 4, 7, 1980, CS);
    }

    private static void listModules(CourseProgramme course) {
        System.out.println("Course: " + course.getCourseCode() + "\nModules:");
        for(Module listElement : course.getModuleList()){
            System.out.print(listElement.getModuleName() + "\n");
        }
        System.out.println("\n");
    }

    private static void studentInfo(Student student) {
        System.out.println("Name: " +student.getStudentName()+ "\nUsername: " +student.getUsername());
        System.out.println("Registered Course: " +student.getCourse().getCourseCode());
        System.out.println("Registered Modules:");
        for(Module listElement : student.getModules()){
            System.out.print(listElement.getModuleName() + "\n");
        }
        System.out.println("\n");

    }

}
