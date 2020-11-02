//WAP to encrypt and decrypt the grade 

public class gradeEncryption {
    public static void main(String[] args) {
        char grade = 'B';

        // the encryption begins here
        char encryptGrade = (char)(grade + 8);
        System.out.println(encryptGrade);

        // the decryption begins here
        encryptGrade = (char)(encryptGrade -8 );
        System.out.println(encryptGrade);
    }
}
