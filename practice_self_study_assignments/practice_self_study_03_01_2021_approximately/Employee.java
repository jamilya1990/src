package practice_self_study_assignments.practice_self_study_03_01_2021_approximately;

public class Employee {
    /* Create a class Employee
create a main method

    Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
        - first name, last name, company name, salary, start day, start month,
        start year, are they full time, job title, office address,
    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

    Display the values of the variables following given example image     */
    public static void main (String [] args) {
        String firstName = "Jamilya";
        String lastName = "Petsenyuk";
        String companyName = "Tesla";
        double salary = 150000.0;
        byte startDay = 15;
        String startMonth = "December";
        short startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "1122 Placerville Road, Sacramento, CA 95827";

        System.out.println("\t***** Tesla New Hire Information*****\n" + firstName + " welcome to " + companyName
        + "\n" + "Your start date as a " + jobTitle + " will be on " + startMonth + " " + startDay + "," + startYear
        + "\n" + "You are fulltime: " + areTheyFullTime + " and will he making " + salary + " per year."
        + "\n" + "The office is located at:\n" + officeAddress);

        String fullName = firstName +" " + lastName;
        String fullStartDate = startMonth + " " + startDay + "," + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salaryAfter3Years = salary + startDay * 10000;

        System.out.println();
        System.out.println("\t Official Information:\nNew hire name:\t\t\t\t\t\t\t" + fullName + "\n" + "Starts on:\t\t\t\t\t\t\t\t"
        + fullStartDate + "\n" + "Email generated:\t\t\t\t\t\t" + email + "\n"
        + "Your expected salary after 3 years:\t\t" + salaryAfter3Years);





    }
}
