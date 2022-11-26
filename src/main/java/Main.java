public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.passport = "1111 № 111111";
        post.patronymic = "Ivanovich";
        post.phone = "+7 911 111 11 11";
        post.surname = "Ivanov";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 26;
        post.birthday.month = 3;
        post.birthday.year = 1994;
    }
}
