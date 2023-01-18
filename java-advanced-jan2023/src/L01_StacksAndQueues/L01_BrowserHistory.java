package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L01_BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        String url = scanner.nextLine();
        history.push(url);

        //Is back the first word
        if (url.equals("back")) {
            System.out.println("no previous URLs");
            url = scanner.nextLine();
            history.push(url);
        }

        while (!url.equals("Home")) {

            if (url.equals("back")) {
                history.pop();

                if (history.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            } else {
                System.out.println(url);
            }


            url = scanner.nextLine();
            history.push(url);
        }

    }
}
