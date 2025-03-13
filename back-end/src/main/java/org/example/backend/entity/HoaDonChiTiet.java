package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

import java.math.BigDecimal;

@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet extends BaseEntity {
    @ManyToOne
    private HoaDon hoaDon;
    @ManyToOne
    private ChiTietSanPham chiTietSanPham;
    private int soLuong;
    private BigDecimal giaSauGiam;
    private BigDecimal giaGiam;

}
