package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

@Entity
@Table(name = "gio_hang")
public class GioHang extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private NguoiDung khachHang;
}
