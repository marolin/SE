public class PlantingShop {
    public static void main(String[] args) {
        double cost=0;
        System.out.println("Welcome to our Lucky Planting Shop\n" +
                "We are selling 5 types of plants in different price depends on sizes of plants\n" +
                "Small plant\t\t 2$\n" +
                "Medium plant\t 3$\n" +
                "Large plant\t\t 4$\n" +
                "Please enjoy!!! \n\n\n");
            Scanner sc = new Scanner(System.in);
            while (true){
            menu();
            int plant = sc.nextInt();
            if (cost > 50 && cost < 100) cost = cost * 0.05;
            else if (cost >= 10 && cost < 200) cost = cost * 0.1;
            else if (cost > 200) cost = cost * 0.15;
            if (plant == 6){
                System.out.printf("The amount " + cost + "$");
                break;
            }
            else if (plant == 1){
                size();
                int size = sc.nextInt();
                System.out.printf("Please input amount of plants you want to buy: ");
                int amount = sc.nextInt();
                if (size == 1){ cost = cost + (amount * 2);
                } else if (size == 2){ cost = cost + (amount * 3);
                } else if (size == 3){ cost = cost + (amount * 4);
                } else { System.out.println("Wrong number please try again!");
                }
                System.out.println();
            }
            else if (plant == 2){
                size();
                int size = sc.nextInt();
                System.out.printf("Please input amount of plants you want to buy: ");
                int amount = sc.nextInt();
                if (size == 1){ cost = cost + (amount * 2);
                } else if (size == 2){ cost = cost + (amount * 3);
                } else if (size == 3){ cost = cost + (amount * 4);
                } else { System.out.println("Wrong number please try again!");
                }
                System.out.println();
            }
            else if (plant == 3){
                size();
                int size = sc.nextInt();
                System.out.printf("Please input amount of plants you want to buy: ");
                int amount = sc.nextInt();
                if (size == 1){ cost = cost + (amount * 2);
                } else if (size == 2){ cost = cost + (amount * 3);
                } else if (size == 3){ cost = cost + (amount * 4);
                } else { System.out.println("Wrong number please try again!");
                }
                System.out.println();
            }
            else if (plant == 4){
                size();
                int size = sc.nextInt();
                System.out.printf("Please input amount of plants you want to buy: ");
                int amount = sc.nextInt();
                if (size == 1){ cost = cost + (amount * 2);
                } else if (size == 2){ cost = cost + (amount * 3);
                } else if (size == 3){ cost = cost + (amount * 4);
                } else { System.out.println("Wrong number please try again!");
                }
                System.out.println();
            }
            else if (plant == 5){
                size();
                int size = sc.nextInt();
                System.out.printf("Please input amount of plants you want to buy: ");
                int amount = sc.nextInt();
                if (size == 1){ cost = cost + (amount * 2);
                } else if (size == 2){ cost = cost + (amount * 3);
                } else if (size == 3){ cost = cost + (amount * 4);
                } else { System.out.println("Wrong number please try again!");
                }
            }else {
                System.out.println("Wrong number please try again!");
        }
    }
}