package org.example.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.backend.entity.base.Status;

import java.time.LocalDateTime;

@Entity
@Table(name = "nguoidung_voucher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NguoiDungVoucher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;
    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;
    private String nguoiTao;
    private String nguoiSua;
    private LocalDateTime ngayTao;
    private LocalDateTime ngaySua;
    @Enumerated(EnumType.STRING)
    private Status trangThai;
}
