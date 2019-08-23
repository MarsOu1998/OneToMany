package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "Student", catalog = "")
public class StudentEntity {
    private int 学号;
    private String 姓名;

    @Id
    @Column(name = "学号")
    public int get学号() {
        return 学号;
    }

    public void set学号(int 学号) {
        this.学号 = 学号;
    }

    @Basic
    @Column(name = "姓名")
    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return 学号 == that.学号 &&
                Objects.equals(姓名, that.姓名);
    }

    @Override
    public int hashCode() {
        return Objects.hash(学号, 姓名);
    }
}
