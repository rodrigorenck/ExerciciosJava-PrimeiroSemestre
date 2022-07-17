package lista01; /**
 *  O domingo de Páscoa é o primeiro domingo após a primeira lua cheia do
equinócio de outono no Hemisfério Sul. Para o cálculo da data da Páscoa
pode-se usar o algoritmo descrito abaixo e inventado pelo matemático Carl
Friedrich Gauss em 1800. Considere que
(a) y representa um ano (por exemplo 2001).
(b) divida y por 19 e armazene o resto da divisão em a.
(c) divida y por 100 e armazene o coeficiente da divisão em b e o resto
da divisão em c.
(d) divida b por 4 e armazene o coeficiente da divisão em d e o resto da
divisão em e.
(e) divida 8 × b + 13 por 25 e armazene o coeficiente da divisão em g.
(f) divida 19 × a + b–d–g + 15 por 30 e armazene o resto da divisão emh.
(g) divida c por 4 e armazene o coeficiente da divisão em j e o resto da
divisão em k.
(h) divida a + 11 × h por 319 e armazene o coeficiente da divisão em m.
(i) divida2 × e + 2 × j–k–h + m + 32 por 7 e armazene o resto da divisão
em r.
(j) divida h–m +r + 90 por 25 e armazene o coeficiente da divisão em n.
(k) divida h–m + r + n + 19 por 32 e armazene o resto da divisão em p.
A Páscoa será no dia p do mês n. Por exemplo, se y é 2001: a = 6, b = 20,
c = 1, d = 5, e = 0, g = 6, h = 18, j = 0, k = 1, m = 0, r = 6, n = 4
e p = 15, ou seja, em 2001, o domingo de Páscoa foi no dia 15 de abril.
Codifique esse algoritmo na linguagem Java.
 */
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int y, a, b, c, d, e;
        System.out.print("Informe o ano: ");
        y = teclado.nextInt();
        a = y%19;
        b = y/100;
        c = y%100;
        d = b/4;
        e = b%4;
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        int n = (h-m+r+90)/25;
        int p = (h-m+r+n+19)%32;

        System.out.println("A pascoa sera no dia " + p + " do mes " + n);

        

    }
}
