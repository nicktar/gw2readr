package de.getsetsociety.gw2readr.general.enums;

public enum Language {
    English("en"),
    French("fr"),
    German("de"),
    Spanish("es"),
    Korean("ko"),
    Chinese("zh");

    private String representation;

    private Language(String represetation) {
        this.representation = represetation;
    }

    @Override
    public String toString() {
        return representation;
    }

}
