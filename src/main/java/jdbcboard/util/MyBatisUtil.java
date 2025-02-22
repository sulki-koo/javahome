package jdbcboard.util;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	 private static SqlSessionFactory sqlSessionFactory;

	    static {
	        try {
	            String resource = "conf/configruation.xml";
	            Reader reader = Resources.getResourceAsReader(resource);
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static SqlSession openSession() {
	        return sqlSessionFactory.openSession();
	    }

	    public static void closeSession(SqlSession session) {
	        if (session != null) {
	            session.close();
	        }
	    }
	}