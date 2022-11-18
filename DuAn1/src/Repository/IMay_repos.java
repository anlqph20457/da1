/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.May;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IMay_repos {

    List<May> getAllMay();

    May getMayByMa(String ma);

    int add(May m);

    int delete(May m);

    int update(May m);
}
