import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus_reservation_and_ticketing_system {


        public Bus_reservation_and_ticketing_system() {
        }

        public static void main(String[] var0) throws IOException {
            BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = false;
            boolean var12 = true;
            int[] var13 = new int[6];
            int[][] var14 = new int[100][3];
            String[][] var15 = new String[100][3];
            double[][] var16 = new double[100][3];
            double[] var17 = new double[20];
            double[] var18 = new double[20];
            int var19 = 1;

            while(true) {
                while(var19 < 4) {
                    System.out.print("Enter User: ");
                    String var2 = var1.readLine();
                    System.out.print("Enter Password: ");
                    String var3 = var1.readLine();

                    int var20;
                    for(var20 = 1; var20 <= 5; ++var20) {
                        var13[var20] = 20;
                    }

                    if (var2.equals("1") && var3.equals("1")) {
                        var20 = 1;

                        while(true) {
                            label265:
                            while(var20 == 1) {
                                System.out.println("********************************************");
                                System.out.println("** BUS RESERVATION AND TICKETING SYSTEM   **");
                                System.out.println("********************************************");
                                System.out.println("** press 1 for Destination                   **");
                                System.out.println("** press 2 for Passengers                    **");
                                System.out.println("** press 3 for Billing                       **");
                                System.out.println("** press 4 for View                          **");
                                System.out.println("** press 5 for Exit                          **");
                                System.out.println("***************************************");
                                System.out.println("***************************************\n");
                                var20 = 1;

                                while(true) {
                                    label250:
                                    while(var20 == 1) {
                                        System.out.print("ENTER CHOICE: ");
                                        String var7 = var1.readLine();
                                        if (var7.equals("1")) {
                                            System.out.println("***************************************");
                                            System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
                                            System.out.println("***************************************");
                                            System.out.println("** 1.)HYDERABAD   | INR600 |   " + var13[1] + "   **");
                                            System.out.println("** 2.)VIZAG  | INR170 |   " + var13[2] + "   **");
                                            System.out.println("** 3.)DELHI   | INR150 |   " + var13[3] + "   **");
                                            System.out.println("** 4.)MUMBAI       | INR200 |   " + var13[4] + "   **");
                                            System.out.println("** 5.)CHENNAI      | INR250 |   " + var13[5] + "   **");
                                            System.out.println("***************************************");
                                            System.out.println("***************************************\n");
                                            System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
                                            var20 = 0;
                                        } else {
                                            boolean var26;
                                            int var27;
                                            boolean var28;
                                            if (var7.equals("2")) {
                                                var26 = true;
                                                System.out.println("***************************************");
                                                System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
                                                System.out.println("***************************************");
                                                System.out.println("** 1.)HYDERABAD   | INR600 |   " + var13[1] + "   **");
                                                System.out.println("** 2.)VIZAG  | INR170 |   " + var13[2] + "   **");
                                                System.out.println("** 3.)DELHI   | INR150 |   " + var13[3] + "   **");
                                                System.out.println("** 4.)MUMBAI       | INR200 |   " + var13[4] + "   **");
                                                System.out.println("** 5.)CHENNAI      | INR250 |   " + var13[5] + "   **");
                                                System.out.println("***************************************");
                                                System.out.println("***************************************\n");
                                                System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
                                                if (var13[1] == 0 && var13[2] == 0 && var13[3] == 0 && var13[4] == 0 && var13[5] == 0) {
                                                    System.out.println("Sorry, We don't  have available seats for all Destination!");
                                                    var20 = 0;
                                                } else {
                                                    var28 = true;

                                                    while(var28) {
                                                        System.out.print("\nENTER PASSENGER'S NAME: ");
                                                        var15[var10][0] = var1.readLine();
                                                        var28 = false;

                                                        for(var27 = 0; var27 < var10; ++var27) {
                                                            if (var15[var27][0].equalsIgnoreCase(var15[var10][0])) {
                                                                System.out.println("Sorry, Passenger's name have already used!");
                                                                var28 = true;
                                                            }
                                                        }
                                                    }

                                                    var28 = true;

                                                    while(var28) {
                                                        System.out.print("ENTER DESTINATION: ");
                                                        var8 = Integer.parseInt(var1.readLine());
                                                        if (var8 < 1 || var8 > 5) {
                                                            System.out.println("Invalid Input!");
                                                            var28 = true;
                                                        }

                                                        for(var27 = 1; var27 <= 5; ++var27) {
                                                            if (var8 == var27) {
                                                                if (var13[var8] == 0) {
                                                                    System.out.println("Sorry, We don't have available seat!");
                                                                    var28 = true;
                                                                }

                                                                var28 = false;
                                                            }
                                                        }
                                                    }

                                                    String[] var30 = new String[]{" ", "HYDERABAD", "VIZAG", "DELHI", "MUMBAI", "CHENNAI"};
                                                    double[] var23 = new double[]{0.0D, 600.0D, 170.0D, 150.0D, 200.0D, 250.0D};
                                                    var15[var10][1] = var30[var8];
                                                    var16[var10][0] = var23[var8];
                                                    var28 = true;

                                                    while(var28) {
                                                        System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
                                                        var14[var10][0] = Integer.parseInt(var1.readLine());

                                                        for(int var24 = 1; var24 <= 5; ++var24) {
                                                            if (var8 == var24) {
                                                                var26 = true;
                                                                var13[var8] -= var14[var10][0];
                                                                if (var13[var8] < 0) {
                                                                    System.out.print("Sorry, We don't have seat available for " + var14[var10][0] + " person\n");
                                                                    var13[var8] += var14[var10][0];
                                                                    System.out.print("We only have " + var13[var8] + " seat available\n");
                                                                    var28 = true;
                                                                    var26 = false;
                                                                } else {
                                                                    var28 = false;
                                                                }
                                                            }
                                                        }
                                                    }

                                                    for(var20 = 1; var20 == 1; var20 = 1) {
                                                        System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
                                                        var14[var10][1] = Integer.parseInt(var1.readLine());
                                                        if (var14[var10][1] <= var14[var10][0]) {
                                                            break;
                                                        }

                                                        System.out.println("Invalid Input!");
                                                        System.out.println("No. of Passengers are only " + var14[var10][0] + "!");
                                                    }

                                                    if (var26) {
                                                        System.out.println("\n***************************************");
                                                        System.out.println("**        PASSENGER'S DETAILS        **");
                                                        System.out.println("***************************************");
                                                        System.out.println("PASSENGER'S NAME: " + var15[var10][0]);
                                                        System.out.println("PASSENGER'S DESTINATION : " + var15[var10][1]);
                                                        System.out.println("FARE PRICE: Php " + var16[var10][0]);
                                                        System.out.println("NO. OF PASSENGERS: " + var14[var10][0]);
                                                        System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + var14[var10][1]);
                                                        System.out.println("***************************************");
                                                        System.out.println("***************************************\n");
                                                        var15[var10][2] = "0";
                                                        double var29 = (var16[var10][0] - var16[var10][0] * 0.2D) * (double)var14[var10][1];
                                                        var16[var10][2] = (double)(var14[var10][0] - var14[var10][1]) * var16[var10][0] + var29;
                                                        var20 = 0;
                                                    }

                                                    ++var10;
                                                }
                                            } else {
                                                String var5;
                                                boolean var22;
                                                if (var7.equals("3")) {
                                                    var20 = 1;

                                                    while(true) {
                                                        do {
                                                            if (var20 != 1) {
                                                                continue label250;
                                                            }

                                                            System.out.print("ENTER PASSENGER'S NAME: ");
                                                            var5 = var1.readLine();
                                                            var26 = true;

                                                            for(var27 = 0; var27 < var10; ++var27) {
                                                                if (var5.equalsIgnoreCase(var15[var27][0])) {
                                                                    System.out.println("***************************************");
                                                                    System.out.println("**        PASSENGER'S DETAILS        **");
                                                                    System.out.println("***************************************");
                                                                    System.out.println("PASSENGER'S NAME: " + var15[var27][0]);
                                                                    System.out.println("PASSENGER'S DESTINATION : " + var15[var27][1]);
                                                                    System.out.println("FARE PRICE: Php" + var16[var27][0]);
                                                                    System.out.println("NO. OF PASSENGERS: " + var14[var27][0]);
                                                                    System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + var14[var27][1]);
                                                                    System.out.println("***************************************");
                                                                    System.out.println("***************************************");
                                                                    var26 = false;
                                                                    var28 = false;
                                                                    if (var15[var27][2].equals("x")) {
                                                                        System.out.println("Passenger's Already Paid!");
                                                                        var20 = 0;
                                                                    } else {
                                                                        var15[var27][2] = "x";
                                                                        var20 = 1;

                                                                        while(var20 == 1) {
                                                                            System.out.println("\nPASSENGER'S TOTAL FARE: Php " + var16[var27][2]);
                                                                            System.out.print("ENTER AMOUNT TO PAY: ");
                                                                            var17[var27] = Double.parseDouble(var1.readLine());
                                                                            var18[var27] = var17[var27] - var16[var27][2];
                                                                            if (var18[var27] < 0.0D) {
                                                                                System.out.println("Invalid Input!");
                                                                                var20 = 1;
                                                                            } else {
                                                                                System.out.println("CHANGE: Php " + var18[var27]);
                                                                                System.out.println("");
                                                                                var20 = 0;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } while(!var26);

                                                        System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
                                                        var22 = true;

                                                        while(var22) {
                                                            System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
                                                            String var6 = var1.readLine();
                                                            if (var6.equalsIgnoreCase("y")) {
                                                                var22 = false;
                                                            } else if (var6.equalsIgnoreCase("n")) {
                                                                var22 = false;
                                                                var20 = 0;
                                                            } else {
                                                                System.out.println("\nInvalid input!\n");
                                                            }
                                                        }
                                                    }
                                                } else if (!var7.equals("4")) {
                                                    if (var7.equals("5")) {
                                                        var11 = true;
                                                        var20 = 0;
                                                        System.out.println("Thank You!");
                                                    } else {
                                                        System.out.println("Invalid Input!");
                                                        var20 = 1;
                                                    }
                                                } else {
                                                    int var21 = 1;

                                                    while(var21 <= 3) {
                                                        System.out.print("SEARCH PASSENGER'S NAME: ");
                                                        var5 = var1.readLine();
                                                        var22 = true;

                                                        for(var20 = 0; var20 <= var10; ++var20) {
                                                            if (var5.equalsIgnoreCase(var15[var20][0])) {
                                                                System.out.println("***************************************");
                                                                System.out.println("**        PASSENGER'S DETAILS        **");
                                                                System.out.println("***************************************");
                                                                System.out.println("PASSENGER'S NAME: " + var15[var20][0]);
                                                                System.out.println("PASSENGER'S DESTINATION : " + var15[var20][1]);
                                                                System.out.println("FARE PRICE: Php" + var16[var20][0]);
                                                                System.out.println("NO. OF PASSENGERS: " + var14[var20][0]);
                                                                System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + var14[var20][1]);
                                                                System.out.println("TOTAL FARE PRICE: Php " + var16[var20][2]);
                                                                if (var15[var20][2].equals("x")) {
                                                                    System.out.println("PAY: Php " + var17[var20]);
                                                                    System.out.println("CHANGE: Php " + var18[var20]);
                                                                    System.out.println("STATUS: PAID");
                                                                } else {
                                                                    System.out.println("STATUS: NOT PAID");
                                                                }

                                                                System.out.println("***************************************");
                                                                System.out.println("***************************************");
                                                                var22 = false;
                                                                var21 = 4;
                                                            }
                                                        }

                                                        if (var22) {
                                                            System.out.println("Passenger's Name not found!");
                                                            ++var21;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    var9 = true;

                                    while(var9 && !var11) {
                                        System.out.print("Do you want another transaction? [Y/N]: ");
                                        String var4 = var1.readLine();
                                        if (var4.equalsIgnoreCase("y")) {
                                            var20 = 1;
                                            var9 = false;
                                        } else {
                                            if (var4.equalsIgnoreCase("n")) {
                                                System.out.println("\nThank You!!!");
                                                continue label265;
                                            }

                                            System.out.println("Invalid Input!!!");
                                            var9 = true;
                                        }
                                    }
                                    break;
                                }
                            }

                            var19 = 4;
                            break;
                        }
                    } else {
                        System.out.println("\nInvalid user or password!\n");
                        ++var19;
                    }
                }

                return;
            }
        }
    }


