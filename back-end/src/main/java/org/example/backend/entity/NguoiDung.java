package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "nguoi_dung")
public class NguoiDung extends BaseEntity {
    private Long ngaySinh;
    private LocalDateTime ngayThamGia;
    private Boolean gioiTinh;
    private String anh;
    private String email;
    private String matKhau;
    private String hangKhachHang;
    private int diem;

}
