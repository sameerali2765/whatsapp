package com.example.whatsapp_clone;

public class contact {



        private String name;
        private String email;
        private String imageUrl;

        public contact(String name, String email, String imageUrl) {
            this.name = name;
            this.email = email;
            this.imageUrl = imageUrl;
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

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

