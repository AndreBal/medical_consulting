package by.balash.consult.model;

import javax.persistence.*;

@Entity
@Table(name = "doctor-info")
public class DoctorInfo {

    private int id;
    private User user;
    private String qualification;
    private Specialization specialization;

    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne(mappedBy = "user")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "qualification")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @ManyToOne(targetEntity = Specialization.class)
    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "DoctorInfo{" +
                "id=" + id +
                ", user=" + user +
                ", qualification='" + qualification + '\'' +
                ", specialization=" + specialization +
                '}';
    }
}
