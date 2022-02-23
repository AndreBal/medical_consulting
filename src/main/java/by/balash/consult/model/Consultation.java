package by.balash.consult.model;

import javax.persistence.Column;
import 	javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "consultation")
public class Consultation {

    private int id;
    private String name;
    private int Price;
    private int Duration;
    private PatientCard patientCard;
    private DoctorInfo doctorInfo;
    private Date date;
    private String result;
    private String diagnosis;

    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Column(name = "duration")
    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    @ManyToOne(targetEntity = PatientCard.class)
    public PatientCard getPatientCard() {
        return patientCard;
    }

    public void setPatientCard(PatientCard patientCard) {
        this.patientCard = patientCard;
    }

    @ManyToOne(targetEntity = DoctorInfo.class)
    public DoctorInfo getDoctorInfo() {
        return doctorInfo;
    }

    public void setDoctorInfo(DoctorInfo doctorInfo) {
        this.doctorInfo = doctorInfo;
    }

    @Column(name = "appointment-date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Column(name = "diagnosis")
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                ", Duration=" + Duration +
                ", patientCard=" + patientCard +
                ", doctorInfo=" + doctorInfo +
                ", date=" + date +
                ", result='" + result + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
