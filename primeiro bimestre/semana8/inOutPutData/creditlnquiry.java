import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class creditlnquiry {
    private menuOption accountType;
    private Scanner input;
    private menuOption choices[] = {menuOption.zero_balance, menuOption.credito_balance, menuOption.debito_balance, menuOption.end};

    private void readRecords() throws IOException{
        AccountRecord record = new AccountRecord();
        try {
            File file = new File("cliente.txt");
            file.createNewFile();
            input = new Scanner(file);
            
            while (input.hasNext()) {
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());
                if(shouldDisplay(record.getBalance())) {
                    System.out.printf(" %-10d%-125%-12s%10.2f\n", record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
                }
            }
        } catch (NoSuchElementException elemException) {
            System.out.println(" erro no arquivo!");
            input.close();
            System.exit(1);
        }
        catch(IllegalStateException stateException) {
            System.out.println("arquivo não encontrado");
            System.exit(1);
        }
        finally {
            if(input != null)
                input.close();
        }
    }

    private boolean shouldDisplay(double balance) {
        if((accountType == menuOption.credito_balance) && (balance<0))
            return true;
        else if((accountType == menuOption.debito_balance) && (balance>0))
            return true;
        else if((accountType == menuOption.zero_balance) && (balance == 0))
            return true;
        return false;
    }

    private menuOption getRequest() {
        Scanner textIn = new Scanner(System.in);
        int request = 1;
        System.out.printf("\n%s\n%s\n%s\n%s\n%s\n", "Enter request", "1 - Lista contas com zero", "2 - Lista contas com credito", "3 - Lista contas com debito", "4 - fim");
        try {
            do {
                System.out.print("\n?");
                request = textIn.nextInt();
            }
            while((request <1) || (request > 4));
        } catch (NoSuchElementException elem) {
            System.out.println("Entrada inválida");
            System.exit(1);
        }
        textIn.close();
        return choices[request - 1];
    }

    public void processRequest() throws IOException {
        accountType = getRequest();
        while (accountType != menuOption.end) {
            switch (accountType) {
                case zero_balance:
                    System.out.println("\nConta com saldo zero:\n");
                    break;
                case credito_balance:
                    System.out.println("\nConta com credito\n");
                case debito_balance:
                    System.out.println("Conta  com debito:\n");
                    break;
                default: 
                    break;
            }
            readRecords();
            accountType = getRequest();
        }
    }
}
