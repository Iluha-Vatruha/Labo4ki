package solutions;

import domain.Text;

public class ReplaceVowelsSolution implements ISolutionText {
    @Override
    public void description() {
        System.out.println("Заменить все гласные буквы в предложении на знак «-»");
    }

    @Override
    public String solve(String t) {
        String result = Text.solutionVowels(t);
        System.out.println(result);
        return result;
    }
}
