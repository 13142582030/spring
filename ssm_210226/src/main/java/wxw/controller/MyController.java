package wxw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wxw.service.MyService;

//注解表明这是表现层的类
@Controller
public class MyController {

    //自动获取业务层的指定类
    @Autowired
    MyService myService;

    //返回页面，index与视图解析器的前、后缀结合
    @RequestMapping("/a.do")
    public  String  aa (){
        myService.dddd();
        return "index";
    }

    //返回JSON格式数据
    @RequestMapping("/b.do")
    @ResponseBody
    public  String bb(){
        return "{'a':1,'b':2}";
    }
}
