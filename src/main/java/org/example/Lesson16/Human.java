package org.example.Lesson16;

public class Human {
    //Завдання 1: Створіть клас Human, який міститиме інформацію про людину.
    // За допомогою механізму успадкування реалізуйте клас Builder (містить інформацію про будівельника),
    // клас Sailor (містить інформацію про моряка),
    // клас Pilot (містить інформацію про льотчика).
    // Кожен із класів має містити необхідні для роботи методи.
    String name;
    int ege;
    String gender;
    String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
