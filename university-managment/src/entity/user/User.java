package entity.user;

import entity.util.lecture.Lecture;
import entity.util.statics.*;

import java.util.ArrayList;
import java.util.HashMap;


public class User {
    //Kullanıcı bilgilerini içeren class
    private String name;
    private String surname;
    private String mail;
    private Rank rank;
    private  int age;
    private long userId;
    private String password;
    private Grade grade;
    private Degree degree;
    private School school;
    private Department department;
    private ArrayList<Lecture> lectures;
    private HashMap<Days,ArrayList<Lecture>> dailyLectureList;
    public User(String name, String surname, String mail, Rank rank, int age, long userId, String password, Grade grade, Degree degree, School school,Department department,ArrayList<Lecture> lectures,HashMap<Days,ArrayList<Lecture>> dailyLectureList){
        this.setName(name);
        this.setSurname(surname);
        this.setMail(mail);
        this.setRank(rank);
        this.setAge(age);
        this.setUserId(userId);
        this.setPassword(password);
        this.setGrade(grade);
        this.setDegree(degree);
        this.setSchool(school);
        this.setDepartment(department);
        this.setLectures(lectures);
        this.setDailyLectureList(dailyLectureList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getMail(){
        return this.mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public ArrayList<Lecture> getLectures(){
        return this.lectures;
    }
    public void setLectures(ArrayList<Lecture> lectures){
        this.lectures = lectures;
    }

    public HashMap<Days, ArrayList<Lecture>> getDailyLectureList() {
        return dailyLectureList;
    }

    public void setDailyLectureList(HashMap<Days, ArrayList<Lecture>> dailyLectureList) {
        this.dailyLectureList = dailyLectureList;
    }
}
