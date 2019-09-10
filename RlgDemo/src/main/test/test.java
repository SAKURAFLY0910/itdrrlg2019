
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class test {
    
    


    @Test
    public void ceshi2(){
        ApplicationContext s=new ClassPathXmlApplicationContext("Spring_Mybatis.xml");
        DriverManagerDataSource sd = (DriverManagerDataSource)s.getBean("dataSource1");
        String url = sd.getUrl();
        System.out.println(url);
    }
}
