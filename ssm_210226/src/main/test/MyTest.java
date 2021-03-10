import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wxw.service.MyService;

//注解用于提供Spring对JUnit4的支持
@RunWith(value = SpringJUnit4ClassRunner.class)
//手动加载spring.xml文件（相当于加载了一个IOC容器）
@ContextConfiguration(value = "classpath:spring.xml")
public class MyTest {


    @Autowired
    MyService myService;

    @Test
    public void ddddasdas(){
        myService.dddd();
        System.out.println("adasda");
    }

}
