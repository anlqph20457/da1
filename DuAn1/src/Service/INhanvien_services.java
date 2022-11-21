/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.NhanVien;
import ViewModel.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author lequy
 */
public interface INhanvien_services {
    List<NhanVienViewModel> getAll();
    int add(NhanVien nv);
    int delete(NhanVien nv);
    int update(NhanVien nv);
    NhanVien getNVByMa(String ma);
    List<NhanVien> findNV(String ketWord);
    public boolean checktr(String tk);
}
