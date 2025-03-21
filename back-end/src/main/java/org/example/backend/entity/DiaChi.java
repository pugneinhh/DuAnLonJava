package org.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String tenNguoiNhan;
    private String soDienThoai;
    private String diaChi;
    private String idXa;
    private Integer idHuyen;
    private Integer idThanhPho;
    private int idQuocGia;
    private String tenXa;
    private String tenHuyen;
    private String tenThanhPho;
    private String quocGia;
    private int trangThai;
    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id",referencedColumnName = "id")
    private NguoiDung nguoiDung;
}
