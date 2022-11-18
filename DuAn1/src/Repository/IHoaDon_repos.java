/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.HoaDon;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IHoaDon_repos {

    List<HoaDon> getAllHD();

    HoaDon getHDByMa(String ma);

    int add(HoaDon h);

    int delete(HoaDon h);

    int update(HoaDon h);
}
