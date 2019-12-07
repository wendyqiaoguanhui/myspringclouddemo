package feign.controller;

import feign.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author QiaoGuanHui
 * @date 2019/11/22-17:20
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中....";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
