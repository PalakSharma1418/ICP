import java.util.*;

public class BattleHeroesVillains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of villains
        int M = sc.nextInt(); // number of heroes
        int H = sc.nextInt(); // health of each hero

        int[] villains = new int[N];
        for (int i = 0; i < N; i++) {
            villains[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(minRemovals(N, M, H, villains));
    }

    public static int minRemovals(int N, int M, int H, int[] villains) {
        int heroesLeft = M;
        int heroHealth = H;

        for (int i = 0; i < N; i++) {
            int villainHealth = villains[i];
            while (villainHealth > 0 && heroesLeft > 0) {
                if (heroHealth > villainHealth) {
                    heroHealth -= villainHealth;
                    villainHealth = 0;
                } else if (heroHealth < villainHealth) {
                    heroesLeft--;        // hero dies
                    heroHealth = H;      // new hero
                } else {
                    villainHealth = 0;   // both die
                    heroesLeft--;
                    heroHealth = H;
                }
            }
            if (villainHealth > 0 && heroesLeft == 0) {
                return i + 1; // remove all villains up to this index
            }
        }

        return 0; // no removals needed
    }
}
