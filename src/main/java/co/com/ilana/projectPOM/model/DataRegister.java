package co.com.ilana.projectPOM.model;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DataRegister {

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String dateOfBirthDayInFormat;
    private String dateOfBirthDay;
    private String dateOfBirthMonth;
    private String dateOfBirthYear;

    public DataRegister() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress().replace(" ", "_");
        this.gender = "Male";
        this.mobile = faker.numerify("3#########");
        this.dateOfBirthDayInFormat = "023";
        this.dateOfBirthDay = "23";
        this.dateOfBirthMonth = "July";
        this.dateOfBirthYear = "2000";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateOfBirthDayInFormat() {
        return dateOfBirthDayInFormat;
    }

    public void setDateOfBirthDayInFormat(String dateOfBirthDayInFormat) {
        this.dateOfBirthDayInFormat = dateOfBirthDayInFormat;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(String dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }
}