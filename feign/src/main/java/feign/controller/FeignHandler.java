package feign.controller;

import feign.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author QiaoGuanHui
 * @date 2019/11/22-17:09
 */
@RequestMapping("/feign")
@RestController
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return feignProviderClient.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        feignProviderClient.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        feignProviderClient.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        feignProviderClient.deleteById(id);
    }

}
