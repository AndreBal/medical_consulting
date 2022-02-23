package by.balash.consult.model;

import javax.persistence.*;

@Entity
@Table(name = "patient-card")
public class PatientCard {

    private User user;
    private String medicalHistory;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(mappedBy = "user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "medical-history")
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "gender")
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PatientCard{" +
                "user=" + user +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
