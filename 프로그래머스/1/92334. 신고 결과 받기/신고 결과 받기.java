import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportInfo = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (String id : id_list) {
            reportInfo.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }
        for (String rep : report) {
            String[] name = rep.split(" ");
            String reporter = name[0];
            String reported = name[1];
            if (!reportInfo.get(reporter).contains(reported)) {
                reportInfo.get(reporter).add(reported);
                reportCount.put(reported, reportCount.get(reported) + 1);
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            Set<String> reportedUsers = reportInfo.get(id_list[i]);
            int count = 0;
            for (String user : reportedUsers) {
                if (reportCount.get(user) >= k) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
