import java.sql.Connection;

public class SaveToDB {
    Config config = new Config();

    String sendToDB(String hasil){
        try {
            String sql = "INSERT INTO testingbinary (hasil) VALUES ('"+hasil+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            return "Sukses";

        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        return "Failed";
    }
}
