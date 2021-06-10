package edu.nuce.quanlybanlaptop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "NameProduct")
    private String nameProduct;

    @Column(name = "Price")
    private Long price;

    @Column(name = "Status")
    private Long status;

    @Column(name = "Description")
    private String description;

    @Column(name = "Quantity")
    private  Long quantity;


    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;

    private Long categoryId;

}
