package org.ies.tierno.models;

public enum Position {
    programer("Programador"), bossProyect("Jefe de proyecto");
    private final String description;

    Position(String description) {
        this.description = description;
    }

    public static Position fromIndex(int opt) {
        return Position.values()[opt];
    }

    public static void printMenu() {
        System.out.println("Elige una opción:");
        for (int i = 0; i < Position.values().length; i++) {
            System.out.println(i + "." + Position.values()[i].description);
        }

    }
}