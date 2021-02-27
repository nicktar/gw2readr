package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IIcon;
import lombok.Data;

@Data
@Entity
@Table
public class Icon implements IIcon {

    @Id
    @Column
    private Integer fileId;

    @Column
    private String signature;
}
