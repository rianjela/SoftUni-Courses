package E06_ObjectsAndClasses.E02Articles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();
        String[] articleArr = scanner.nextLine().split(", ");
        int commandsCount = Integer.parseInt(scanner.nextLine());

        String title = articleArr[0];
        String content = articleArr[1];
        String author = articleArr[2];

        articleList.add(new Article(title, content, author));


        for (int i = 0; i < commandsCount; i++) {
            String[] actionArr = scanner.nextLine().split(": ");

            switch (actionArr[0]) {
                case "Edit":
                    for (Article article : articleList) {
                        article.editContent(actionArr[1]);
                    }
                    break;
                case "ChangeAuthor":
                    for (Article article : articleList) {
                        article.changeAuthor(actionArr[1]);
                    }
                    break;
                case "Rename":
                    for (Article article : articleList) {
                        article.renameTitle(actionArr[1]);
                    }
                    break;
            }

        }
            System.out.println(articleList.get(0));
    }
}
