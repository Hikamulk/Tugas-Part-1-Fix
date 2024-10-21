package kelas;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class User {
    private Connection konek;
    private PreparedStatement ps;

    private String user_name, user_email, user_password, user_fullname;
    private int user_status;

    public User() {
        try {
            koneksi koneksi = new koneksi();
            konek = koneksi.koneksiDB(); 
        } catch (SQLException e) {
            System.out.println("Error: Tidak dapat terhubung ke database.");
            e.printStackTrace(); 
        }
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserEmail() {
        return user_email;
    }

    public void setUserEmail(String user_email) {
        this.user_email = user_email;
    }

    public String getUserPassword() {
        return user_password;
    }

    public void setUserPassword(String user_password) {
        this.user_password = user_password;
    }

    public String getUserFullName() {
        return user_fullname;
    }

    public void setUserFullName(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public int getUserStatus() {
        return user_status;
    }

    public void setUserStatus(int user_status) {
        this.user_status = user_status;
    }

    public void TambahUser() {
        String query = "INSERT INTO user (user_name, user_email, user_password, user_fullname, user_status) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = konek.prepareStatement(query);
            ps.setString(1, getUserName());
            ps.setString(2, getUserEmail());
            ps.setString(3, getUserPassword());
            ps.setString(4, getUserFullName());
            ps.setInt(5, getUserStatus());
            ps.executeUpdate();
            System.out.println("Data user berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Error: Gagal menambahkan user.");
            e.printStackTrace();
        }
    }
}
