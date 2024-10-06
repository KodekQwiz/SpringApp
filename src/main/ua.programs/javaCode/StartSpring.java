import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class StartSpring {
    public static void main(String[] args) {
        Start();
    }


    public static void Start(){
        Scanner sc = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        System.out.println("расказать про трек?\n" +
                "1.Да\n" +
                "2.нет");
        int choice = sc.nextInt();



        MusicSettings musicSettings = context.getBean("musicSettings", MusicSettings.class);

        if (choice == 1) {
            System.out.println("Название музыки:" + musicSettings.getName() + " \n" +
                    "Громкость: " + musicSettings.getVolume() + " \n" +
                    "Автор: " + musicSettings.getMusic().Author() + " \n" +
                    "Дискрипция " + musicSettings.getMusic().Description() + " \n" +
                    "Выпуск: " + musicSettings.getMusic().Years());

        } else if (choice == 2) {
            context.close();
        }
        context.close();

    }
}
