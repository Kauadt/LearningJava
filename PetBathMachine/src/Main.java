import src.Pet;
import src.PetMachine;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do{
            System.out.println("----- Escolha uma das opções -----");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se a máquina está ocupada");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina ");
            System.out.println("9 - Limpar a máquina ");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 0 -> System.exit(0);
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                default -> System.out.println("Opção inválida");
            }
        } while (option != 0);
    }

    private static void setWater(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("No momento, a máquina está com " + amount + "L de shampoo");
    }
    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("No momento, a máquina está com " + amount + "L de água");
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "A máquina está ocupada" : "A máquina não está ocupada");
    }


    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do Pet");
            name = scanner.next();
        }
         var pet = new Pet(name);
         petMachine.setPet(pet);
    }

}
