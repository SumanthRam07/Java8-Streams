package QuestionClasses;

public class Employee {



        private int id;

        private String name;

        private int age;

        private String gender;

        private double salary;


        // Constructor

        public Employee(int id, String name, int age, String gender, double salary) {

            this.id = id;

            this.name = name;

            this.age = age;

            this.gender = gender;

            this.salary = salary;

        }


        // Getters

        public String getGender() {

            return gender;

        }


        public double getSalary() {

            return salary;

        }


        @Override

        public String toString() {

            return String.format("Employee{id=%d, name='%s', age=%d, gender='%s', salary=%.2f}", id, name, age, gender, salary);

        }

    }

