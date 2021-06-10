package edu.nuce.quanlybanlaptop.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Component
@Table(name = "Category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "NameType")
    private String NameType;

    @Column(name = "Status")
    private int status;

   @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
   private List<Product> productList = new ArrayList<>();
}
