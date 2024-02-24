// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
// студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
// значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
// числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("1.txt"));
            List<String> sb = new ArrayList();
            String content = br.readLine();
            while (content != null) {
                content = content.toString();
                sb.add(content);
                content = br.readLine();
            }
            br.close();
            HashMap<String, Integer> map = new HashMap<>();
            for (String i : sb) {
                String[] parts = i.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Не корректное кол-во аргументов!");
                }
                map.put(parts[0], parts[0].length());
            }
            StringBuilder output = new StringBuilder();
            FileWriter file = new FileWriter("1.txt");
            for (String name : map.keySet()) {
                output.append(name).append("=").append(map.get(name)).append("\n");
            }
            file.write(String.valueOf(output));
            file.flush();
            file.close();
            // System.out.println(sb);
            // bw.write(String.valueOf(output));
            // bw.flush();
        } finally {
            // br.close();
            // bw.close();
        }

    }
}