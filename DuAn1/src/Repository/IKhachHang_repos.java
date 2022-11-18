/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.KhachHang;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IKhachHang_repos {

    List<KhachHang> getAllKH();

    KhachHang getKHByMa(String ma);

    List<KhachHang> findKH(String keyWord);

    int add(KhachHang k);

    int update(KhachHang k);

    int delete(KhachHang k);
}
