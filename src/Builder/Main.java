package Builder;

public class Main {
    public static void main(String args[]){
        Student studentObj = Student.builder()
                            .id(1)
                            .name("Ritobina")
                            .age(26)
                            .batchName("LLD2")
                            .psp(90.12)
                            .gradYear(2024)
                            .phoneNumber("877001")
                            .build();

    }
}
