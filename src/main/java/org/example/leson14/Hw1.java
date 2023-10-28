package org.example.leson14;

import java.util.Scanner;

public class Hw1 {

        private String fullName;
        private String birthDate;
        private String contactPhone;
        private String city;
        private String country;
        private String homeAddress;

        public void Person1() {

            fullName = "";
            birthDate = "";
            contactPhone = "";
            city = "";
            country = "";
            homeAddress = "";
        }

        public void enterData() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("ПІБ: ");
            fullName = scanner.nextLine();
            System.out.print("Дата народження:");
            birthDate = scanner.nextLine();
            System.out.print("Контактний телефон: ");
            contactPhone = scanner.nextLine();
            System.out.print("Місто: ");
            city = scanner.nextLine();
            System.out.print("Країна: ");
            country = scanner.nextLine();
            System.out.print("Домашня адреса: ");
            homeAddress = scanner.nextLine();
        }

        public void displayData() {
            System.out.println("ПІБ: " + fullName);
            System.out.println("Дата народження: " + birthDate);
            System.out.println("Контактний телефон: " + contactPhone);
            System.out.println("Місто: " + city);
            System.out.println("Країна: " + country);
            System.out.println("Домашня адреса: " + homeAddress);
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getContactPhone() {
            return contactPhone;
        }

        public void setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHomeAddress() {
            return homeAddress;
        }

        public void setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
        }
}