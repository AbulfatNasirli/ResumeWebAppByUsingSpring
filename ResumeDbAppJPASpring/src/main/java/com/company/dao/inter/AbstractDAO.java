//package com.company.dao.inter;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public abstract class AbstractDAO {
//
//	public Connection connection() throws Exception{
//		Class.forName("com.mysql.jdbc.Driver");
//		String url="jdbc:mysql://localhost:3306/resume?serverTimezone=UTC";
//		String userName="root";
//		String password="201408020";
//		Connection c=DriverManager.getConnection(url, userName, password);
//		return c;
//	}
//
//        private static EntityManagerFactory emf = null;
//
//
//        public EntityManager em(){
//            if(emf==null){
//                emf=Persistence.createEntityManagerFactory( "resumeappPU" );
//            }
//             EntityManager entitymanager = emf.createEntityManager( );
//             return entitymanager;
//        }
//
//        public void closeEntityManagerFactory(){
//        emf.close();
//        }
//
//
//}
