package string;


public class Count_vowels_consonants {
    public static void main(String[] args) {
        String a = "I love India";

        int n = a.length();
        int consonants=0;
        int vowels=0;
        for(int i=0;i<n;i++){
            char ch = a.charAt(i);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'
                    ||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'
                    ||ch=='U') {
                vowels++;
            }else if(ch>='a'&& ch<='z'|| ch=='A'&& ch=='Z') {
                consonants++;
            }

            }
        System.out.println("Vowels="+vowels);
        System.out.println("Consonants="+consonants);
        }
    }
