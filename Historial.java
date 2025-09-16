import java.util.Scanner;
import java.util.Stack;

public class Historial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Pagina> historial = new Stack<>();


        System.out.print("1: Ingrese la URL de la página. 2: Retrocder. 3: Historial de paginas. 0: Para salir: ");

        int opt = sc.nextInt();

        while (opt != 0) {
            switch (opt) {
                case 1:
                    Pagina p = new Pagina();
                    System.out.print("Ingrese la URL: ");
                    String url = sc.next();
                    p.setUrl(url);
                    System.out.print("Ingrese el título: ");
                    String titulo = sc.next();
                    p.setTitulo(titulo);
                    p.setFechaAcceso();
                    historial.push(p);
                    break;
                case 2:
                    if (!historial.isEmpty()) {
                        historial.pop();
                    } else {
                        System.out.println("No hay páginas en el historial.");
                    }
                    break;
                case 3:
                    if (historial.isEmpty()) {
                        System.out.println("No hay páginas en el historial.");
                    } else {
                        System.out.println("Historial de páginas:");
                        for (Pagina pagina : historial) {
                            System.out.println(pagina);
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            System.out.print("1: Introduce la URL de la página. 2: Retroceder. 3: Historial de paginas. 0: Para salir: ");
            opt = sc.nextInt();
            
        }
    }
}
