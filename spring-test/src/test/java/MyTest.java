import com.kuang.pojo.service.HelloServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring上下文对象 拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们要使用直接取就可以了 需要什么直接get就可以了
        HelloServiceImpl helloi = (HelloServiceImpl) context.getBean("helloi");
        System.out.println(helloi);
    }
}
