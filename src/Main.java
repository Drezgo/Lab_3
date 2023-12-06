import java.util.Scanner;

public class Main {
    //Створюю простий банківський застосунок
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Wallet wallet = new Wallet();
        Wallet2 wallet2 = new Wallet2(0,0,0,36.93,39.33);
        Wallet3 wallet3 = new Wallet3(0,0,0,36.93,39.33);

        //Змінна для зупинки безкінечного циклу
        boolean activeSession = true;

        //Діалогове меню ПОЧАТОК
        System.out.println("#############################################################################################");
        System.out.println("           Створимо власний рахунок: ");
        wallet.inputBalance();

        wallet2.inputBalance(10000);
        wallet3.inputBalance(10000);

        while (activeSession) {
            wallet.statistics();
            wallet2.statistics();
            wallet3.setExchangeUSD(36.93);//<<<<<<<<<<<<------------------------
            System.out.println("__________________________ "+wallet3.getExchangeUSD()+" $________________________________");//<<<<<<<-----------
            wallet3.statistics();
            System.out.println("Оберіть наступну дію: ");
            System.out.println("[1]  Конвертувати валюту у USD");
            System.out.println("[2]  Конвертувати валюту у EUR");
            System.out.println("[3]  ---");

            System.out.println("[4]  Купити 10 $ на основний рахунок");
            System.out.println("[5]  Купити 10 $ на 2ий гаманець");
            System.out.println("[6]  Купити 10 $ на 3ій гаманець");
            System.out.println("[0]  Вийти");

            //Вибір дії
            System.out.print("---> ");
            int firstChoose = scan.nextInt();
            switch (firstChoose) {
                case 1:
                    System.out.println(wallet.convertToUSD());
                    break;
                case 2:
                    System.out.println(wallet.convertToEUR());
                    break;

                case 4:
                    System.out.println(wallet.buy10USD(10)+" гривень");
                    break;
                case 5:
                    System.out.println(wallet2.buy10USD(10)+" гривень");
                    break;
                case 6:
                    System.out.println(wallet3.buy10USD(10)+" гривень");
                    break;
                case 0:
                    activeSession=false;
                    System.out.println("           ДО ПОБАЧЕННЯ! ");
                    break;
                default:
                    System.out.println("ERROR");
                    activeSession=false;
                    break;
            }

        }

    }
}