package org.example.Leson15;

public class Practic15Book {
    private String name;
    private String auhtorName;
    private String vendor;
    private String year;
    private String genre;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuhtorName() {
        return auhtorName;
    }

    public void setAuhtorName(String auhtorName) {
        this.auhtorName = auhtorName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Practic15Book() {
        name = "Constityciya";
        auhtorName = "Oleksandr ";
        year = "1942";
        vendor = "BP";
        genre = "Zakon";
        pages = 500;
    }

    public Practic15Book(String name, String auhtorName, String vendor, String year, String genre, int pages) {
        this.name = name;
        this.auhtorName = auhtorName;
        this.vendor = vendor;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Practic15Book{" +
                "name='" + name + '\'' +
                ", auhtorName='" + auhtorName + '\'' +
                ", vendor='" + vendor + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
}
