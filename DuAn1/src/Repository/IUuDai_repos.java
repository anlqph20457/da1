/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.UuDai;
import java.util.List;

/**
 *
 * @author hung duong
 */
public interface IUuDai_repos {

    List<UuDai> getAllUuDai();

    UuDai getDatMayByMa(String ma);

    int add(UuDai ud);

    int delete(UuDai ud);

    int update(UuDai ud);
}
