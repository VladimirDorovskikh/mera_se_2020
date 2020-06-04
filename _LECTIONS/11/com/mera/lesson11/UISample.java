package com.mera.lesson11;

public class UISample {


    interface ButtonHandler {
        void onButtonClick();
    }

    static class Button {
        String name;
        ButtonHandler onClick;

        public Button(String name, ButtonHandler onClick) {
            this.name = name;
            this.onClick = onClick;
        }

        void click() {
            onClick.onButtonClick();
        }
    }




    public static void main(String[] args) {
        Button save = new Button("Save", () -> {
            System.out.println("Что-то сохранилось в базу данныъ");
        });

        Button closeWindow = new Button("Save", new ButtonHandler() {
            @Override
            public void onButtonClick() {
                System.out.println("Окно закрылось");
            }
        });

        save.click();
        closeWindow.click();
    }
}
