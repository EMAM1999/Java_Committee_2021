package Projects.oop.A38M;

import java.util.ArrayList;
import java.util.Scanner;

public class School {

      public static void main(String[] args) { // score = 95%
            Scanner sc = new Scanner(System.in);
            ArrayList<Student> s1 = new ArrayList<Student>();
            ArrayList<Student> st2 = new ArrayList<Student>(); // array for fill students in any subject
            Principal p = null;
            ArrayList<Teacher> t1 = new ArrayList<Teacher>();
            ArrayList<Subject> s2 = new ArrayList<Subject>();
            int counter = -1;
            int choise3 = 0; // counter for adding list of Student in one Subject
            int choise4 = 0; // condition for (do - While ) loop 
            int counter7 = 0;
            System.out.println("Hello Our Customer To School Managment Program ");
            do {
                  System.err.println("Please Enter The Number Which Represent The Operation You Want : ");
                  System.out.println("----------");
                  System.out.println("1- Add Employee\n"
                          + "2- Add Student. \n"
                          + "3- Add Subject.\n"
                          + "4- Show Principal.\n"
                          + "5- Search for Teacher.\n"
                          + "6- search for Subject.\n"
                          + "7- search for Student . \n"
                          + "8- Remove a Teacher From The School "
                          + "9- Remove a Student From The School "
                          + "10- Remove a Student From The School "
                          + "11- Exit");
                  int choise1 = 0;
                  try {
                        choise1 = sc.nextInt();
                  } catch ( Exception e ) {
                        System.out.println("^^^^^^^^^^^^^^^^^^");
                        System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                        System.exit(0);
                  }
                  if ( choise1 == 11 ) {
                        System.out.println("Thanks For Using our Program ");
                        System.exit(0);
                  }
                  switch ( choise1 ) {
                        case 1:
                              System.err.println("Please Enter The Number Which Represent The Operation You Want : ");
                              System.out.println("1- Principal        2- Teacher ");
                              int choise2 = 0;
                              try {
                                    choise2 = sc.nextInt();
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              switch ( choise2 ) {
                                    case 1:
                                          double PrincipalBonus = 0;
                                          int PrincipalId = 0;
                                          int PrincipalAddress = 0;
                                          int PrincipalPhoneNumber = 0;
                                          double PrincipalBasicSalary = 0;
                                          int gender = 0;
                                          System.out.println("Please Enter The Principal Name Without spaces ");
                                          String PrincipalName = sc.next();
                                          System.out.println("Please Enter The Principal Email Without spaces ");
                                          String PrincipalEmail = sc.next();
                                          try {
                                                System.out.println("Please Enter 1 if The Principal is Male   OR    Enter 2 if The Principal is Female ");
                                                gender = sc.nextInt();
                                                System.out.println("Please Enter The PrincipalBonus ");
                                                PrincipalBonus = sc.nextDouble();
                                                System.out.println("Please Enter The Principal Id ");
                                                PrincipalId = sc.nextInt();
                                                System.out.println("Please Enter The Principal Address ");
                                                PrincipalAddress = sc.nextInt();
                                                System.out.println("Please Enter The Principal PhoneNumber ");
                                                PrincipalPhoneNumber = sc.nextInt();
                                                System.out.println("Please Enter The Principal basic Salary ");
                                                PrincipalBasicSalary = sc.nextDouble();
                                          } catch ( Exception e ) {
                                                System.out.println("^^^^^^^^^^^^^^^^^^");
                                                System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                                System.exit(0);
                                          }
                                          p = new Principal(PrincipalBonus, PrincipalName, PrincipalId, PrincipalAddress, PrincipalPhoneNumber, PrincipalEmail, PrincipalBasicSalary);
                                          if ( gender == 1 ) {
                                                p.setGender(Gender.Male);
                                          } else if ( gender == 2 ) {
                                                p.setGender(Gender.Female);
                                          } else {
                                                System.out.println("ERROR , You Entered Wrong Number");
                                                System.exit(0);
                                          }
                                          break;
                                    case 2:
                                          int NumberOfClassesHeTeaches = 0;
                                          double TeacherBonus = 0;
                                          int TeacherId = 0;
                                          int TeacherAddress = 0;
                                          int TeacherPhoneNumber = 0;
                                          double TeacherBasicSalary = 0;
                                          double TeacherBouns = 0;
                                          double SalaryDeduction = 0;
                                          int gender1 = 0;
                                          System.out.println("Please Enter The Teacher Name Without spaces ");
                                          String TeacherName = sc.next();
                                          System.out.println("Please Enter The Teacher Email Without spaces ");
                                          String TeacherEmail = sc.next();
                                          try {
                                                System.out.println("Please Enter 1 if The Principal is Male   OR    Enter 2 if The Principal is Female ");
                                                gender1 = sc.nextInt();
                                                System.out.println("Please Enter The Teacher Id ");
                                                TeacherId = sc.nextInt();
                                                System.out.println("Please Enter The Teacher Address ");
                                                TeacherAddress = sc.nextInt();
                                                System.out.println("Please Enter The Teacher PhoneNumber ");
                                                TeacherPhoneNumber = sc.nextInt();
                                                System.out.println("Please Enter The Teacher basic Salary ");
                                                TeacherBasicSalary = sc.nextDouble();
                                                System.out.println("Please Enter The Teacher Bonus ");
                                                TeacherBouns = sc.nextDouble();
                                                System.out.println("Please Enter The Teacher SalaryDeduction ");
                                                SalaryDeduction = sc.nextDouble();
                                                System.out.println("Please Enter The Teacher Number Of Classes He Teaches ");
                                                NumberOfClassesHeTeaches = sc.nextInt();

                                          } catch ( Exception e ) {
                                                System.out.println("^^^^^^^^^^^^^^^^^^");
                                                System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                                System.exit(0);
                                          }
                                          Teacher t = new Teacher(NumberOfClassesHeTeaches, TeacherName, TeacherId, TeacherAddress, TeacherPhoneNumber, TeacherEmail, TeacherBasicSalary, TeacherBouns, SalaryDeduction);
                                          if ( gender1 == 1 ) {
                                                t.setGender(Gender.Male);
                                          } else if ( gender1 == 2 ) {
                                                t.setGender(Gender.Female);
                                          } else {
                                                System.out.println("ERROR , You Entered Wrong Number");
                                                System.exit(0);
                                          }
                                          t1.add(t);
                                          System.out.println(t.toString());
                                          break;
                              }
                              break;
                        case 2:
                              try {
                                    int StudentId = 0;
                                    String StudentName;
                                    int StudentLevel = 0;
                                    System.out.println("Please Enter The Student Name Without spaces ");
                                    StudentName = sc.next();
                                    System.out.println("Please Enter The Student Id ");
                                    StudentId = sc.nextInt();
                                    System.out.println("Please Enter The Student Level ");
                                    StudentLevel = sc.nextInt();
                                    Student s = new Student(StudentId, StudentName, StudentLevel);
                                    s1.add(s);
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              break;
                        case 3:
                              counter++;
                              System.out.println("Please Enter The Name Of Subject Without spaces ");
                              String SubjectName = sc.next();
                              Subject s3 = new Subject(SubjectName);
                              s2.add(s3);
                              System.out.println("Please Enter The Information of Teacher Who Teaches This Subject ");
                              System.out.println("^^^^^^^^^^^^^^^^^^^^");
                              int NumberOfClassesHeTeaches1 = 0;
                              double TeacherBonus1 = 0;
                              int TeacherId1 = 0;
                              int TeacherAddress1 = 0;
                              int TeacherPhoneNumber1 = 0;
                              double TeacherBasicSalary1 = 0;
                              double TeacherBouns1 = 0;
                              double SalaryDeduction1 = 0;
                              System.out.println("Please Enter The Teacher Name Without spaces ");
                              String TeacherName1 = sc.next();
                              System.out.println("Please Enter The Teacher Email Without spaces ");
                              String TeacherEmail1 = sc.next();
                              try {
                                    System.out.println("Please Enter The Teacher Id ");
                                    TeacherId1 = sc.nextInt();
                                    System.out.println("Please Enter The Teacher Address ");
                                    TeacherAddress1 = sc.nextInt();
                                    System.out.println("Please Enter The Teacher PhoneNumber ");
                                    TeacherPhoneNumber1 = sc.nextInt();
                                    System.out.println("Please Enter The Teacher basic Salary ");
                                    TeacherBasicSalary1 = sc.nextDouble();
                                    System.out.println("Please Enter The Teacher Bonus ");
                                    TeacherBouns1 = sc.nextDouble();
                                    System.out.println("Please Enter The Teacher SalaryDeduction ");
                                    SalaryDeduction1 = sc.nextDouble();
                                    System.out.println("Please Enter The Teacher Number Of Classes He Teaches ");
                                    NumberOfClassesHeTeaches1 = sc.nextInt();

                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              Teacher t = new Teacher(NumberOfClassesHeTeaches1, TeacherName1, TeacherId1, TeacherAddress1, TeacherPhoneNumber1, TeacherEmail1, TeacherBasicSalary1, TeacherBouns1, SalaryDeduction1);
                              s2.get(counter).teacher = t;
                              do {
                                    System.out.printf("Please Enter The Information of Student %s Who register In This Subject ", (counter7 + 1));
                                    System.out.println("");
                                    System.out.println("^^^^^^^^^^^^^^^^^");
                                    int StudentId1 = 0;
                                    String StudentName1;
                                    int StudentLevel1 = 0;
                                    System.out.printf("Please Enter The Student %s Name Without spaces ", (counter7 + 1));
                                    System.out.println("");
                                    StudentName1 = sc.next();
                                    try {
                                          System.out.printf("Please Enter The Student %s Id ", (counter7 + 1));
                                          StudentId1 = sc.nextInt();
                                          System.out.printf("Please Enter The Student %s Level ", (counter7 + 1));
                                          StudentLevel1 = sc.nextInt();
                                    } catch ( Exception e ) {
                                          System.out.println("^^^^^^^^^^^^^^^^^^");
                                          System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                          System.exit(0);
                                    }
                                    Student st1 = new Student(StudentId1, StudentName1, StudentLevel1);
                                    st2.add(st1);
                                    System.out.println(st2.size());
                                    s2.get(counter).setStudent(st2);
                                    try {
                                          System.out.println("Please Enter 1 if You Want To Add Another Student   OR    Enter 2 if You do not Want ");
                                          choise3 = sc.nextInt();
                                    } catch ( Exception e ) {
                                          System.out.println("^^^^^^^^^^^^^^^^^^");
                                          System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                          System.exit(0);
                                    }
                                    counter7++;

                              } while ( choise3 == 1 );
                              break;
                        case 4:
                              System.out.println(p.toString());
                              break;
                        case 5:
                              int counter2 = 0;
                              int choise6 = 0;
                              try {
                                    System.out.println("Please Enter an Id of The Teacher");
                                    choise6 = sc.nextInt();
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              for ( int i = 0; i < t1.size(); i++ ) {
                                    if ( t1.get(i).getId() == choise6 ) {
                                          System.out.println(t1.get(i).toString());
                                          counter2++;
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter2 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        case 6:
                              int counter3 = 0;
                              System.out.println("Please Enter The Name Of This subject ");
                              String Name = sc.next();
                              for ( int i = 0; i < s2.size(); i++ ) {
                                    if ( s2.get(i).getSubjectName().equals(Name.toLowerCase().trim()) ) {
                                          System.out.println(s2.toString());
                                          counter3++;
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter3 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        case 7:
                              int counter5 = 0;
                              int id = 0;
                              try {
                                    System.out.println("Please Enter Student Id ");
                                    id = sc.nextInt();
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              for ( int i = 0; i < s1.size(); i++ ) {
                                    if ( s1.get(i).getStudentId() == id ) {
                                          System.out.println(s1.get(i).toString());
                                          counter5++;
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter5 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        case 8:
                              int counter8 = 0;
                              int choise8 = 0;
                              try {
                                    System.out.println("Please Enter an Id of The Teacher");
                                    choise6 = sc.nextInt();
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              for ( int i = 0; i < t1.size(); i++ ) {
                                    if ( t1.get(i).getId() == choise8 ) {
                                          System.out.println(t1.get(i).toString());
                                          counter8++;
                                          t1.remove(i);
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter8 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        case 9:
                              int counter9 = 0;
                              System.out.println("Please Enter The Name Of This subject ");
                              String Name2 = sc.next();
                              for ( int i = 0; i < s2.size(); i++ ) {
                                    if ( s2.get(i).getSubjectName().equals(Name2.toLowerCase().trim()) ) {
                                          System.out.println(s2.toString());
                                          counter9++;
                                          s2.remove(i);
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter9 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        case 10:
                              int counter10 = 0;
                              int id1 = 0;
                              try {
                                    System.out.println("Please Enter Student Id ");
                                    id1 = sc.nextInt();
                              } catch ( Exception e ) {
                                    System.out.println("^^^^^^^^^^^^^^^^^^");
                                    System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                                    System.exit(0);
                              }
                              for ( int i = 0; i < s1.size(); i++ ) {
                                    if ( s1.get(i).getStudentId() == id1 ) {
                                          System.out.println(s1.get(i).toString());
                                          counter10++;
                                          s1.remove(i);
                                          break;
                                    } else {
                                          continue;
                                    }
                              }
                              if ( counter10 == 0 ) {
                                    System.out.println("Not Found ");
                              }
                              break;
                        default:
                              System.exit(0);
                  }
                  try {
                        System.out.println("Please Enter 1 if You Want To do another Operation   OR    Enter 2 if You do not Want ");
                        choise4 = sc.nextInt();
                  } catch ( Exception e ) {
                        System.out.println("^^^^^^^^^^^^^^^^^^");
                        System.out.println("Sorry , You Entered Wrong Thing " + "\n" + "Thanks For Using Our Program " + "\n");
                        System.exit(0);
                  }
            } while ( choise4 == 1 );

      }
}
