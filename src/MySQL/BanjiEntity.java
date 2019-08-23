package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Banji", schema = "Student", catalog = "")
public class BanjiEntity {
    private int 班级号;
    private String 班级名字;

    @Id
    @Column(name = "班级号")
    public int get班级号() {
        return 班级号;
    }

    public void set班级号(int 班级号) {
        this.班级号 = 班级号;
    }

    @Basic
    @Column(name = "班级名字")
    public String get班级名字() {
        return 班级名字;
    }

    public void set班级名字(String 班级名字) {
        this.班级名字 = 班级名字;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanjiEntity that = (BanjiEntity) o;
        return 班级号 == that.班级号 &&
                Objects.equals(班级名字, that.班级名字);
    }

    @Override
    public int hashCode() {
        return Objects.hash(班级号, 班级名字);
    }
}
