package wxw.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wxw.dao.NewMapper;

//注解表明这是业务层的类
@Service
public class MyService {

    //自动获取持久层的接口（接口已经在整合mybatis中实例化了，所以可以使用）
    @Autowired
    NewMapper newMapper;

    public void dddd(){
        System.out.println("dddddddddddd");

    }
}
