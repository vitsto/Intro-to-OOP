public class Human {
    private final String name;
    private final int yearOfBirth;
    private final String city;
    private final String post;

    private final String INFORMATION_NOT_DEFINED = "Информация не указана";

    public Human(String name, int yearOfBirth, String city, String post) {
        this.name = name;
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.city = city;
        this.post = post;
    }

    public boolean isDefine(String str) {
        return !(str == null || str.equals(""));
    }

    public String getName() {
        return isDefine(name) ? name : INFORMATION_NOT_DEFINED;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return isDefine(city) ? city : INFORMATION_NOT_DEFINED;
    }

    public String getPost() {
        return isDefine(post) ? post : INFORMATION_NOT_DEFINED;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + " Я из города " + getCity() +
                ". Я родился в  " + getYearOfBirth() + " году. Я работаю на должности " + getPost() + ". Будем знакомы!";
    }
}
