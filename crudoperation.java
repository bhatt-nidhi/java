import java.util.*;
import java.sql.*;

class conn {
    Scanner sc = new Scanner(System.in);
    String url;
    String unm;
    String pwd;
    Connection con;

    conn() {
        try {
            url = "jdbc:mysql://localhost:3306/exam";
            unm = "root";
            pwd = "";
            con = DriverManager.getConnection(url, unm, pwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class create extends conn {
    create() {
        try {

            String q = " create table cia (id int(20) primary key auto_increment , name varchar(100) not null,stream varchar(50) not null) ";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table is created successfully....");
        } catch (Exception e) {

        }
    }
}

class insert extends conn {
    insert() {
        try {
            System.out.println("enter your name");
            String nm = sc.next();

            System.out.println(" enter your stream");
            String stm = sc.next();

            String q = "insert into cia (name,stream) values ('" + nm + "', '" + stm + "')";
            Statement prs = con.createStatement();
            prs.executeUpdate(q);

            System.out.println("your data is inserted....");
            // con.close();
        } catch (Exception e) {

        }
    }
}

class display extends conn {
    display() {
        try {
            Statement stmt = con.createStatement();
            String q = "select * from cia ";
            ResultSet rs = stmt.executeQuery(q);

            System.out.println("student ID \t student name \t student stream");
            System.out.println("=================================================\n");
            while (rs.next()) {
                System.out.println("\t\t" + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));

            }
            con.close();

        } catch (Exception e) {

        }
    }
}

class search extends conn {
    search() {
        try {
            Statement stmt = con.createStatement();
            System.out.println("enete the id of record");
            int s_id = sc.nextInt();
            String q = "select * from cia WHERE id=" + s_id + " ";
            ResultSet rs = stmt.executeQuery(q);

            System.out.println("student ID \t student name \t student stream");
            System.out.println("=================================================\n");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));

            }
            con.close();

        } catch (Exception e) {

        }
    }
}

class update extends conn {
    update() {
        try {
            new display();
            System.out.print("update record ID : ");
            String id = sc.nextLine();

            System.out.println("enter updated name : ");
            String name = sc.nextLine();

            System.out.println("enter updated stream :");
            String str = sc.nextLine();

            String q = "update cia set name = '" + name + "',stream= '" + str + "' WHERE id = " + id;
            Statement st = con.createStatement();
            int rc = st.executeUpdate(q);
            if (rc == 1) {
                System.out.println("the record is updated successfully...");
                new display();
            }
            con.close();
        } catch (Exception e) {

        }

    }
}

class delete extends conn {
    delete() {
        try

        {
            Statement stmt = con.createStatement();
            System.out.println("enter the record you want to delete");
            int del = sc.nextInt();
            String d = "delete from cia where ID=" + del + " ";
            stmt.executeUpdate(d);
            System.out.println("row deleted..");
            new display();

        } catch (Exception e) {

        }
    }
}

class menu extends conn {
    menu() {

        System.err.println("1--> to insert the records : ");
        System.out.println("2-->to display the record :");
        System.out.println("3-->to search the records : ");
        System.out.println("4-->to update the records : ");
        System.out.println("5-->to delete the records :");
        System.out.println("6--> exit");
    }
}

class choise extends conn {
    choise() {
        while (true) {
            new menu();
            System.out.print("enter the choise : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    new insert();
                    break;

                case 2:
                    new display();
                    break;

                case 3:
                    new search();
                    break;

                case 4:
                    new update();
                    break;

                case 5:
                    new delete();
                    break;

                case 6:
                    System.exit(0);
                    break;

            }

        }
    }
}

class crudoperation extends conn {
    public static void main(String[] args) {
        create cr = new create();
        choise cha = new choise();
    }
}
