import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class x027highScores {
    List<Integer> highScores;
    
    public x027highScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        sortedScores.sort(Collections.reverseOrder());
        return sortedScores.get(0);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        sortedScores.sort(Collections.reverseOrder());
        
        return sortedScores.subList(0, Math.min(3, sortedScores.size()));
    }

}
