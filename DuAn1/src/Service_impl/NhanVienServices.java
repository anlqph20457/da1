/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service_impl;

import Model.NhanVien;
import Repository_impl.NhanVien_repos;
import Service.INhanvien_services;
import ViewModel.NhanVienViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lequy
 */
public class NhanVienServices implements INhanvien_services {

    NhanVien_repos repos = new NhanVien_repos();

    @Override
    public List<NhanVienViewModel> getAll() {
    List<NhanVien> list = repos.getALllNV();
    List<NhanVienViewModel> view = new ArrayList<>();
   
        for (NhanVien n : list) {
            view.add(new NhanVienViewModel(n.getId(),n.getTenTK_NV(),n.getMatKhauNV(),
                n.getHoTen(),n.getGioiTinh(),n.getSdt(),n.getNgaySinh(),n.getDiachi(),n.getTrangThai()));
        }
        return view;
    }

    @Override
    public int add(NhanVien nv) {
        return repos.add(nv);
    }

    @Override
    public int delete(NhanVien nv) {
        return repos.delete(nv);
    }

    @Override
    public int update(NhanVien nv) {
        return repos.update(nv);
    }

}
