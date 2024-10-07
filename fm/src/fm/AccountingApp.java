package fm;
import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
public class AccountingApp {  
    private List<Transaction> transactions = new ArrayList<>();  
  
    public void addTransaction() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("�����뽻������: ");  
        String description = scanner.nextLine();  
        System.out.print("�����뽻�׽��: ");  
        double amount = scanner.nextDouble();  
        System.out.print("��������? (y/n): ");  
        boolean isIncome = scanner.next().equalsIgnoreCase("y");  
        scanner.nextLine(); // ������з�  
  
        Transaction transaction = new Transaction(description, amount, isIncome);  
        transactions.add(transaction);  
        System.out.println("���������: " + transaction);  
    }  
  
    public void listTransactions() {  
        for (Transaction transaction : transactions) {  
            System.out.println(transaction);  
        }  
    }  
  
    public static void main(String[] args) {  
        AccountingApp app = new AccountingApp();  
  
        while (true) {  
            System.out.println("1. ��ӽ���");  
            System.out.println("2. �г����н���");  
            System.out.print("������ѡ�� (1/2): ");  
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());  
  
            switch (choice) {  
                case 1:  
                    app.addTransaction();  
                    break;  
                case 2:  
                    app.listTransactions();  
                    break;  
                default:  
                    System.out.println("��Ч��ѡ����������룡");  
            }  
        }  
    }  
}
