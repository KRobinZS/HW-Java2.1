//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Ticket = 15524; // цена билета
        int Mile = 20; // 1 миля = 20 руб
        int bonus = Ticket / Mile;
        System.out.println("Количество начисленных миль:" + bonus);
    }
}