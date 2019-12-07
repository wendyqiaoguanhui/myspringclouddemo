package eurekaclient.repository;

import eurekaclient.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author QiaoGuanHui
 * @date 2019/11/20-10:36
 */

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
