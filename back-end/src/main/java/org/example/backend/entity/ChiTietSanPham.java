package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

import java.math.BigDecimal;

@Entity
@Table(name = "chi_tiet_san_pham")
public class ChiTietSanPham extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn(name = "kich_thuoc_id")
    private KichThuoc kichThuoc;
    @ManyToOne
    @JoinColumn(name = "mau_sac_id")
    private MauSac mauSac;
    @ManyToOne
    @JoinColumn(name = "chat_lieu_id")
    private ChatLieu chatLieu;
    @ManyToOne
    @JoinColumn(name = "de_giay_id")
    private DeGiay deGiay;
    @ManyToOne
    @JoinColumn(name = "danh_muc_id")
    private DanhMuc danhMuc;
    @ManyToOne
    @JoinColumn(name = "hang_id")
    private Hang hang;
    private String tenCt;
    private String ghiChu;
    private BigDecimal giaBan;
    private BigDecimal giaNhap;
    private BigDecimal giaGiam;
    private String moTa;
    private int soLuong;

}
