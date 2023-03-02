public class Main {
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task5Ext();
        Task6Ext();
        Task7Ext();
        Task8Ext();
    }

    public static void  Task1()
    {
        System.out.println("Задание 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }
    public static void  Task2()
    {
        System.out.println("Задание 2");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
    }

    public static void Task3()
    {
        System.out.println("Задание 3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println();
    }

    public static void Task5Ext()
    {
        System.out.println("Задание 5 Повышенная сложность");
        String fullName = "Ivanov Ivan Ivanovich";

        int indexFirstName = fullName.indexOf(' ');
        int indexMiddleName = indexFirstName + fullName.indexOf(' ');
        int indexLastName = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(0, indexFirstName);
        String middleName = fullName.substring(indexFirstName, indexMiddleName);
        String lastName = fullName.substring(indexLastName);

        System.out.println("Имя сотрудника — " + middleName);
        System.out.println("Фамилия сотрудника — " + firstName);
        System.out.println("Отчество сотрудника " + lastName);
        System.out.println();
    }
    public static void Task6Ext()
    {
        System.out.println("Задание 6 Повышенная сложность");
        //String fullName = "ivanov ivan ivanovich";
        String fullName = "фамилия имя отчество";
        char[] prepareString = fullName.toCharArray();
        prepareString[0] = Character.toUpperCase(prepareString[0]);
        for (int i = 0; i < prepareString.length; i++)
        {
            if(prepareString[i] == ' ')
            {
                prepareString[i+1] = Character.toUpperCase(prepareString[i+1]);
            }
        }
        String finalName = new String(prepareString);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + finalName);
        System.out.println();

    }
    public static void Task7Ext()
    {
        System.out.println("Задание 7 Повышенная сложность");
        String firstStr = "135";
        String secondStr = "246";
        int strLength = firstStr.length() + secondStr.length();

        StringBuilder result = new StringBuilder();


        for(int i = 0; i < strLength/2; i++)
        {
            result = result.append(firstStr.charAt(i));
            result = result.append(secondStr.charAt(i));
        }
        System.out.println("Данные строки — " + result);
        System.out.println();
    }
    public static void Task8Ext()
    {
        System.out.println("Задание 8 Повышенная сложность");
        String str = "aabccddefgghiijjkk";
        StringBuilder sb = new StringBuilder(str);
        String result = new String();

        for(int i = 0; i < str.length() - 1; i++)
        {
            if(sb.charAt(i) == sb.charAt(i + 1))
            {
                result += sb.charAt(i);
            }
        }
        System.out.println(result);
    }
}