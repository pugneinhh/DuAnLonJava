package org.example.backend.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class TimSanPhamTheoMang {
    String[] arraySanPham;
    String[] arrayMauSac;
    String[] arrayKichThuoc;
    int giaBatDau;
    int giaKetThuc;
}
