//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; // цена билета
        int mile = 20; // 1 миля = 20 руб
        int bonusMile = ticketPrice / mile;
        System.out.println("Количество начисленных миль:" + bonusMile);
    }
}