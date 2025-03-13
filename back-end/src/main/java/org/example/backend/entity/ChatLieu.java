package org.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.backend.entity.base.BaseEntity;

@Entity
@Table(name = "chat_lieu")
public class ChatLieu extends BaseEntity {
}
