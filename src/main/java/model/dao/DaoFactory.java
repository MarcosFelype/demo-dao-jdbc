/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author felype
 */
public class DaoFactory {
    
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC();
    }
    
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
