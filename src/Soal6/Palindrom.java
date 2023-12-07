package Soal6;

public class Palindrom {
    int Start;
    int end;
    boolean status;
    char[] word;
//TODO: mengecek apakah suatu kata atau frase adalah palindrom atau tidak.
    public boolean ispalindrome(char[] word){
        this.word = word;
        this.Start = 0;
        this.end = word.length - 1;
        this.status = true;
        while (Start < end) {
            if (word[Start] != word[end]) {
                this.status = false;
                break;
            }
            Start++;
            end--;
        }
        return status;

    }
}
