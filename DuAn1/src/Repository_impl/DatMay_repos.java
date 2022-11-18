package Repository_impl;

/**
 *
 * @author hung duong
 */
public class DatMay_repos {

    final String INSERT_SQL = "INSERT INTO DatMay (IdSP,MoTa,SoLuongTon,GiaNhap,GiaBan) VALUES (?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietSP SET IdSP = ?, IdNsx = ?,IdMauSac = ?, IdDongSP = ?,NamBH = ?, MoTa = ?,SoLuongTon = ?,GiaNhap = ?, GiaBan= ?  WHERE Id =?";
    final String DELETE_SQL = "DELETE FROM ChiTietSP WHERE Id = ?";
    final String SELECT_BY_SQL = "SELECT * FROM ChiTietSP  WHERE Ma = ?";
    final String SELECT_BY_SQL_2 = "SELECT * FROM SanPham WHERE Id = ?";
    final String SELECT_ALL_SQL = "select sanpham.Id,MoTa,SoLuongTon,GiaNhap,GiaBan from SanPham join ChiTietSP on SanPham.Id = ChiTietSP.IdSP";
}
