package pl.tima.homework.homework22;

 class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Wal");
//        st1.setName(sb1);
//        st1.setCourse(2);
        st1.setAvGrade(4.5);
        st1.showInfo();
    }
}
