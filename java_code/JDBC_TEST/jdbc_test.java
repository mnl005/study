package JDBC_TEST;

import java.sql.*;
import java.util.ArrayList;

public class jdbc_test {
    private Statement stmt = null;
    private ResultSet rs = null;
    private PreparedStatement pstmt = null;
    private String driver = null;
    private String url = null;
    private String username = null;
    private String password = null;
    private Connection conn = null;
    private ArrayList<ArrayList> search = new ArrayList<ArrayList>();

    public void link() {
        try {
            this.driver = "com.mysql.cj.jdbc.Driver";
            this.url = "jdbc:mysql://localhost:3306/main?user=root&password=0000@&serverTimezone=UTC";
            this.username = "root";
            this.password = "0000";
            this.conn = DriverManager.getConnection(url, username, password);
            this.stmt = conn.createStatement();
            System.out.println("______________________________________________mysql 연결!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void query() {
        try {
            String query = "SELECT * FROM test1";
            this.rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id);
                System.out.println("name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 테이블 이름 입력받아 해당 테이블의 모든 필드 출력
    public void print_table_field(String table_name) {
        try {

            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet columns = metaData.getColumns(null, null, table_name, null);

            // 필드 이름을 출력
            System.out.println(table_name + " 테이블의 모든 필드 이름:");
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                System.out.println(columnName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        jdbc_test sql = new jdbc_test();
        sql.link();
        sql.query();
        sql.print_table_field("test1");


    }
}
