package edu.nuce.quanlybanlaptop.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;
    private Date BirthDay;
    private Date RegisterDate;
    private Date LastModifiedDate;
    private int Status;
    private String Username;
    private String Password;
    private Long RoleId;
}
