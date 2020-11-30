package passphrase;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassphraseGeneratorTests {
    private final List<String> lowers;
    private final List<String> uppers;
    private final List<String> numbers;


    PassphraseGeneratorTests() {
        this.lowers = Arrays.asList("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(","));
        this.uppers = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z".split(","));
        this.numbers = Arrays.asList("1,2,3,4,5,6,7,8,9,0".split(","));
    }

    @Test
    public void generatePassphraseNotContainUppers(){
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(true,false,true);
        for(int i=0;i<100000;i++){
            var password = passphraseGenerator.generate(1024);
            assertEquals(password,password.toLowerCase());
        }

    }
    @Test
    public void generatePassphraseBySpecifiedLength(){
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(true,true,true);
        int Passlen = 10;
        var password = passphraseGenerator.generate(Passlen);
        assertEquals(password.length(),Passlen);
    }
    @Test
    public void generateEmptyWhenAllConfigIsFalse(){
        PassphraseGenerator passphraseGenerator = new PassphraseGenerator(true,true,true);
        var password = passphraseGenerator.generate(0);
        assertEquals(password,"");
    }
}
