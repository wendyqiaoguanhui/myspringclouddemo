package eurekaclient.repository;

import eurekaclient.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author QiaoGuanHui
 * @date 2019/11/20-10:35
 */
@Repository
public class StudentRepositoryImpl  implements StudentRepository{

    private Map<Long,Student> studentMap;

    public StudentRepositoryImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",'男'));
        studentMap.put(2L,new Student(2L,"李四",'女'));
        studentMap.put(3L,new Student(3L,"王五",'男'));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);

    }
}
