package ru.javarush.java.core.level25.task06;

public class EmailClient {

    // Нестатический внутренний класс: письмо существует только в контексте EmailClient
    class Email{
        private String content;

        public Email(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }


    // Метод, который "составляет" письмо и возвращает новый объект Email
    public Email composeEmail(String messageContent) {
        // Создаем письмо, привязанное к текущему экземпляру EmailClient
        Email email = new Email(messageContent);
        return email;
    }

    public static void main(String[] args) {
        // Создаем почтовый клиент
        EmailClient emailClient = new EmailClient();
        Email email = emailClient.composeEmail("email");
        System.out.println(email.getContent());


        // Составляем тестовое письмо через метод composeEmail


        // Проверяем, что письмо создано: выводим его содержимое


    }
}