package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

@Entity
@Table(name = "san_pham")
public class SanPham extends BaseEntity{
}
