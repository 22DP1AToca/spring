package rvt.Exercises.EnumIterator;

public enum Education{
    PHD("PHD"),
    MA("MA"),
    BA("BA"),
    HS("HS");

    private String education;        // object reference variable

    private Education(String education) { // constructor
        this.education = education;
    }
}

