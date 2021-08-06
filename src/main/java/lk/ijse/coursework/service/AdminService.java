package lk.ijse.coursework.service;

import lk.ijse.coursework.dto.AdminDTO;

import java.util.ArrayList;


public interface AdminService {
    boolean addAdmin(AdminDTO dto);

    AdminDTO searchAdmin(String id);

    boolean deleteAdmin(String id);



    boolean updateAdmin(AdminDTO dto);

    ArrayList<AdminDTO> getAllAdmins();
}
