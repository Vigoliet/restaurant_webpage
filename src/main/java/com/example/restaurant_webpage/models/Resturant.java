package com.example.restaurant_webpage.models;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
public class Resturant {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "restaurant_id")
        private Integer id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "address", nullable = false)
        private String address;

        @Column(name = "city", nullable = false)
        private String city;

        @Column(name = "state", nullable = false)
        private String state;

        @Column(name = "zip_code")
        private String zipCode;

        @Column(name = "phone_number")
        private String phoneNumber;

        @Column(name = "website_url")
        private String websiteUrl;

        // getters and setters
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getWebsiteUrl() {
            return websiteUrl;
        }

        public void setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
        }
    }


