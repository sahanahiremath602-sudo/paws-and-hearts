import java.util.Scanner;

public class pawsandhearts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       WELCOME TO PAWS AND HEARTS       ");
        System.out.println("========================================");

        System.out.println("Welcome to Pet Adoption!");
        System.out.println("Give a loving home to a furry friend.");
        System.out.println();

        int choice;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. View Available Pets");
            System.out.println("2. View Pet Adoption Details");
            System.out.println("3. Apply for Pet Adoption");
            System.out.println("4. View Adoption Guidelines");
            System.out.println("5. Contact Information");
            System.out.println("6. Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n===== AVAILABLE PETS =====");

                    System.out.println("\n1. Milo");
                    System.out.println("   Animal: Cat");
                    System.out.println("   Breed: Persian");
                    System.out.println("   Age: 4 months");
                    System.out.println("   Gender: Male");
                    System.out.println("   Adoption Fee: Rs. 1500");

                    System.out.println("\n2. Bella");
                    System.out.println("   Animal: Dog");
                    System.out.println("   Breed: Labrador");
                    System.out.println("   Age: 1 year");
                    System.out.println("   Gender: Female");
                    System.out.println("   Adoption Fee: Rs. 2000");

                    System.out.println("\n3. Luna");
                    System.out.println("   Animal: Cat");
                    System.out.println("   Breed: Orange Tabby");
                    System.out.println("   Age: 3 months");
                    System.out.println("   Gender: Female");
                    System.out.println("   Adoption Fee: Rs. 1000");

                    System.out.println("\n4. Charlie");
                    System.out.println("   Animal: Dog");
                    System.out.println("   Breed: Golden Retriever");
                    System.out.println("   Age: 8 months");
                    System.out.println("   Gender: Male");
                    System.out.println("   Adoption Fee: Rs. 1800");

                    System.out.println("\n5. Coco");
                    System.out.println("   Animal: Rabbit");
                    System.out.println("   Breed: Holland Lop");
                    System.out.println("   Age: 5 months");
                    System.out.println("   Gender: Female");
                    System.out.println("   Adoption Fee: Rs. 800");

                    System.out.println("\nEvery pet deserves a loving home!");
                    break;

                case 2:
                    System.out.println("\n===== PET ADOPTION DETAILS =====");

                    System.out.println("Our pets are waiting for loving families.");
                    System.out.println("Each pet has its own personality and needs.");
                    System.out.println();
                    System.out.println("Cats: Friendly, playful and independent.");
                    System.out.println("Dogs: Loyal, active and affectionate.");
                    System.out.println("Rabbits: Gentle, curious and adorable.");
                    System.out.println();
                    System.out.println("Please consider your lifestyle before adopting.");
                    System.out.println("Ask about the pet's health and care requirements.");
                    break;

                case 3:
                    System.out.println("\n===== ADOPTION APPLICATION =====");

                    System.out.print("Enter your full name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter your age: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Please enter a valid age.");
                        sc.next();
                        System.out.print("Enter your age: ");
                    }

                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter your city: ");
                    String city = sc.nextLine();

                    System.out.print("Enter your phone number: ");
                    String phone = sc.nextLine();

                    System.out.println("\nAvailable pets:");
                    System.out.println("1. Milo - Persian Cat");
                    System.out.println("2. Bella - Labrador Dog");
                    System.out.println("3. Luna - Orange Tabby Cat");
                    System.out.println("4. Charlie - Golden Retriever");
                    System.out.println("5. Coco - Rabbit");

                    System.out.print("\nEnter the number of the pet you want to adopt: ");

                    while (!sc.hasNextInt()) {
                        System.out.println("Please enter a valid pet number.");
                        sc.next();
                        System.out.print("Enter pet number: ");
                    }

                    int petChoice = sc.nextInt();
                    sc.nextLine();

                    String petName = "";
                    int fee = 0;

                    switch (petChoice) {
                        case 1:
                            petName = "Milo";
                            fee = 1500;
                            break;

                        case 2:
                            petName = "Bella";
                            fee = 2000;
                            break;

                        case 3:
                            petName = "Luna";
                            fee = 1000;
                            break;

                        case 4:
                            petName = "Charlie";
                            fee = 1800;
                            break;

                        case 5:
                            petName = "Coco";
                            fee = 800;
                            break;

                        default:
                            System.out.println("Invalid pet selection.");
                    }

                    if (petChoice >= 1 && petChoice <= 5) {

                        if (age < 18) {
                            System.out.println("\nSorry, you must be at least 18 years old to apply.");
                            System.out.println("A parent or legal guardian may apply instead.");
                        } else {

                            System.out.println("\n===== APPLICATION SUMMARY =====");
                            System.out.println("Applicant Name: " + name);
                            System.out.println("Age: " + age);
                            System.out.println("City: " + city);
                            System.out.println("Phone: " + phone);
                            System.out.println("Selected Pet: " + petName);
                            System.out.println("Listed Adoption Fee: Rs. " + fee);

                            System.out.println("\nYour application has been recorded in this session.");
                            System.out.println("The adoption team must review your application.");
                            System.out.println("Adoption is not confirmed until approval.");
                            System.out.println("\nThank you for choosing to adopt!");
                        }
                    }

                    break;

                case 4:
                    System.out.println("\n===== ADOPTION GUIDELINES =====");

                    System.out.println("1. Provide a safe and comfortable home.");
                    System.out.println("2. Ensure regular food and clean drinking water.");
                    System.out.println("3. Provide necessary veterinary care.");
                    System.out.println("4. Give your pet love, attention and exercise.");
                    System.out.println("5. Keep vaccinations and health checks up to date.");
                    System.out.println("6. Make sure your family agrees to the adoption.");
                    System.out.println("7. Understand the long-term responsibility.");
                    System.out.println("8. Complete the adoption review process.");

                    System.out.println("\nAdoption is a lifelong commitment!");
                    break;

                case 5:
                    System.out.println("\n===== CONTACT INFORMATION =====");

                    System.out.println("Organization: Paws And Hearts");
                    System.out.println("Service: Pet Adoption and Animal Care");
                    System.out.println("Email: pawsandhearts@example.com");
                    System.out.println("Phone: Contact number to be added");
                    System.out.println("Location: Contact the organization for details.");

                    System.out.println("\nGive them love. Give them a home.");
                    break;

                case 6:
                    System.out.println("\nThank you for visiting Paws And Hearts!");
                    System.out.println("Every paw deserves love and care.");
                    System.out.println("Goodbye! Have a wonderful day!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select from 1 to 6.");
            }

        } while (choice != 6);

        sc.close();
    }
}

