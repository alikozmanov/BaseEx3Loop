import java.util.Scanner; // 1.2

public class Test { 

    public static void main(String[] args) { 

        Scanner scan = new Scanner(System.in); 

        try { 
            System.out.println("Veuillez entrer des nombres : ");
            String input = scan.nextLine().trim(); 

            // Vérifie si aucune donnée n'a été entrée
            if (input.isEmpty()) { 
                throw new IllegalArgumentException("Aucun nombre n'a été entré. Veuillez réessayer."); // Lance une exception si l'entrée est vide
            }

            String[] argsInput = input.split(" "); // Sépare l'entrée utilisateur en un tableau de chaînes (chaque nombre)

            // Parcourt chaque argument du tableau
            for (String arg : argsInput) { // Boucle pour chaque élément dans le tableau argsInput
                try { 
                    int number = Integer.parseInt(arg); // Convertir l'argument en entier
                    System.out.println("Nombre : " + number); 

                    // Vérifie si le nombre est zéro
                    if (number == 0) { 
                        System.out.println("Le nombre est zéro (et il est pair)"); 
                    } else if (number < 0) { 
                        System.out.print("Le nombre est négatif "); 
                    } else { 
                        System.out.print("Le nombre est positif "); 
                    }

                    // Vérifie si le nombre est pair ou impair et l'affiche
                    System.out.println(number % 2 == 0 ? "et pair" : "et impair"); 

                } catch (NumberFormatException e) { // Gère le cas où l'argument ne peut pas être converti en entier
                    System.out.println("Erreur : " + arg + " n'est pas un nombre valide."); // Affiche un message d'erreur pour les entrées non valides
                }
            }
        } catch (IllegalArgumentException e) { // Gère le cas où l'entrée est vide
            System.out.println(e.getMessage());
        } finally { // Bloc finally pour garantir l'exécution du code suivant
            scan.close(); 
        }
    }
}

