import java.time.LocalDate;

public class Human {
    private final String name;
    private int yearOfBirth;
    private String city;
    private final String post;

    private final String INFORMATION_NOT_DEFINED = "Информация не указана";

    public Human(String name, int yearOfBirth, String city, String post) {
        this.name = isDefine(name) ? name : INFORMATION_NOT_DEFINED;
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.city = isDefine(city) ? city : INFORMATION_NOT_DEFINED;
        this.post = isDefine(post) ? post : INFORMATION_NOT_DEFINED;
    }

    private boolean isDefine(String str) {
        return !(str == null || str.isEmpty() || str.isBlank());
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int age) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = isDefine(city) ? city : INFORMATION_NOT_DEFINED;
    }

    public String getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + " Я из города " + getCity() +
                ". Я родился в  " + getYearOfBirth() + " году. Я работаю на должности " + getPost() + ". Будем знакомы!";
    }
}
