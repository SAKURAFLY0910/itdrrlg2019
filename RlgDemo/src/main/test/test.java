import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class test {
    
    
    @Test
    public void ceshi(){
        ApplicationContext s=new ClassPathXmlApplicationContext("Spring_Mybatis.xml");
        BasicDataSource sd = (BasicDataSource)s.getBean("dataSource");
        String url = sd.getUrl();
        System.out.println(url);
    }

    @Test
    public void ceshi2(){
        ApplicationContext s=new ClassPathXmlApplicationContext("Spring_Mybatis.xml");
        DriverManagerDataSource sd = (DriverManagerDataSource)s.getBean("dataSource1");
        String url = sd.getUrl();
        System.out.println(url);
    }
}
