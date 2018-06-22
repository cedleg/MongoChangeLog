import com.cedleg.mongoconfig.MongobeeConfiguration;
import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main( String[] args){

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongobeeConfiguration.class);
        Mongobee mongobee = (Mongobee) context.getBean("mongobee");
        //MongobeeConfiguration mongoDB = new MongobeeConfiguration();
        try {
            mongobee.execute();
        } catch (Exception ex) {System.out.println(ex.getMessage());}
    }
}
