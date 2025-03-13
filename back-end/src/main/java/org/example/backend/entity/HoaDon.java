package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "hoa_don")
public class HoaDon extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private NguoiDung nguoiDung;
    @ManyToOne
    @JoinColumn(name="voucher_id")
    private Voucher voucher;
    private LocalDateTime ngayMua;
    private BigDecimal giaGoc;
    private BigDecimal giaGiamGia;
    private BigDecimal thanhTien;
    private int diemSuDung;
    private int giaTriDiem;
    private int loaiHoaDon;
    private String tenNguoiNhan;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private String qrCode;
    private String ghiChu;
    private Date ngayDuKienNhan;
    private Date ngayNhanHang;
    private Date ngayTraHang;
    private BigDecimal tienVanChuyen;
    private int traSau;
}
