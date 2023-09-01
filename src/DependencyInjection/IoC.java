package DependencyInjection;

/**
 * XML Configuration
 * <bean id="MySql" class="com.java.MySql"/>
 * <bean id="Oracle" class="com.java.Oracle"/>
 * <bean id="user" class="com.java.user"/>
 *      <arg ref="MySql"/>
 *      <arg ref="Oracle"/>
 * </bean>
 */
public class IoC {
    public static void main(String[] args) {
        IoC container = new IoC();
        User user = null;
        User user2;

//        User user =container.new User(container.new MySqlDatabase())
//        User user2 =container.new User(container.new MySqlDatabase())
//        User user3 =container.new User(container.new MySqlDatabase());
        user.add("This is some data!");
    }

    /**
     * business layer logic
     */

    public class User{
        Database database;
        Database database2;

//        sending the database object as the parameter rather than string parameter.

        public User(Database database, Database database2){

            this.database = database;
            this.database2=database2;
        }

        private void add(String data){
            this.database = database;
        }
    }

    public interface Database{
        void persist(String data);
    }

    /**
     * Database Access Layer
     */

    public class MySqlDatabase implements Database{

        @Override
        public void persist(String data){
            System.out.println("MySql has persisted"+data);
        }
    }

    public class OracleDatabase implements Database{

        @Override
        public void persist(String data){
            System.out.println("Oracle has persisted"+data);
        }
    }
}
