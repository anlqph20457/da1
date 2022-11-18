/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.DichVu;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IDichVu_repos {

    List<DichVu> getALllDV();

    DichVu getDVByMa(String ma);

    List<DichVu> findNV(String keyWord);

    int add(DichVu dv);

    int delete(DichVu dv);

    int update(DichVu dv);
}
