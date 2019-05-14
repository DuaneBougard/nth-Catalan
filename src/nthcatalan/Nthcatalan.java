/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nthcatalan;

/**
 *
 * @author Duane
 */
public class Nthcatalan {
public int catalan(int n) {
        int res = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Nthcatalan cn = new Nthcatalan();
        for (int i = 0; i < 8; i++) {
            System.out.print(cn.catalan(i) + " ");
        }
    }
}
