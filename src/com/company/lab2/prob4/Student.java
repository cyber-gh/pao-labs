package com.company.lab2.prob4;

public class Student {
    private String nume;
    private float nota;

    public Student(String nume, float nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
