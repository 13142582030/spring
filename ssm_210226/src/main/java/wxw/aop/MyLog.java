package wxw.aop;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

//注解表明它是组件（Controller、Service、Mybatis以外）
//在这里它用于实现日志功能（AOP中实现,具体参考spring.xml中）
@Component
public class MyLog {

    //日志底层为Spring默认的 JCL，日志门面用的默认
    Log log = LogFactory.getLog(MyLog.class);

    public void doBefore(){
        System.out.println(log.getClass());
        log.info("aaaa");
        System.out.println("========");
    }
}
