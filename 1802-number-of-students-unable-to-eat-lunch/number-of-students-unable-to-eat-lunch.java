class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);
        }

        for (int student : students) {
            q.offer(student);
        }

        int rotations = 0;

        while (!st.isEmpty() && rotations < q.size()) {
            if (q.peek() == st.peek()) {
                q.poll();
                st.pop();
                rotations = 0;   // reset after a student eats
            } else {
                q.offer(q.poll());
                rotations++;
            }
        }

        return q.size();
    }
}