package com.example.restaurant_webpage.models;
import jakarta.persistence.*;
import java.time.Instant;

    @Entity
    @Table (name = "City")
    public class City {

        public City() {

        }

        public City(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Long id;

        private String name;


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

        @Override
        public String toString() {
            return "City{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


