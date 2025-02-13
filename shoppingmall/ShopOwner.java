package com.tns.shoppingmall;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ShopOwner {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String shopName;
    private String shopAddress;

    /**
     * Constructor to initialize a ShopOwner object.
     *
     * @param name        the name of the shop owner
     * @param email       the email address of the shop owner
     * @param phoneNumber the phone number of the shop owner
     * @param shopName    the name of the shop
     * @param shopAddress the address of the shop
     */
    public ShopOwner(String name, String email, String phoneNumber, String shopName, String shopAddress) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    @Override
    public String toString() {
        return "ShopOwner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}


