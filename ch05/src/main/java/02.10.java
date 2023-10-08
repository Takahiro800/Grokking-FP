import java.util.ArrayList;
import java.util.List;

class TipCalclulator {
    private List<String> names = new ArrayList<>();
    private int tipPercentage = 0;

    // 戻り値を一つ
    // 既存の値を変更しない
    public void addPerson(String name) {
        names.add(name);
        if (names.size() > 5) {
            tipPercentage = 20;
        } else if (names.size() > 0) {
            tipPercentage = 10;
        }
    }

    public List<String> getNames() {
        return names;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }
}


class Refactor {
    // データのコピーを渡す
    public List<String> addPerson(List<String> names, String name) {
        List<String> updated = new ArrayList<>(names);
        updated.add(name);
        return updated;
    }

    // 格納せずに再計算させる
    public static int getTipPercentage(List<String> names) {
        if (names.size() > 5) {
            return 20;
        } else if (names.size() > 0) {
            return 10;
        } else
            return 0;
    }
}
