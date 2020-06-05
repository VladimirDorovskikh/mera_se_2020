package com.katepopkova;

public enum Strings {
    ROOT_DIRECTORY("SE2020_LESSON9"),
    FILE_NAME_ROOT("File_"),
    EXPANSION(".txt"),
    HAS_LENGTH(" has length "),
    MIN_SIZE("Minimum size: "),
    MAX_SIZE("Maximum size: "),
    FOLDER_EXISTS(" folder exists."),
    FAILED_OPERATION("Some operation has been failed."),
    SMALLEST_FILES("The smallest files: "),
    BIGGEST_FILES("The biggest files: "),
    SMALLEST("smallest"),
    BIGGEST("biggest"),
    FILES_HAVE_BEEN_DELETED("All directories and files have been deleted.");

    private String str;

    Strings(String str) {
        this.str = str;
    }

    public String getValue() {
        return str;
    }
}