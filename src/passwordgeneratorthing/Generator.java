package passwordgeneratorthing;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Generator{
  public int length;
  SecureRandom rn = null;
  
  public Generator(int len){
    this.length = len;
    this.rn = new SecureRandom();
    rn.setSeed(System.currentTimeMillis());
  }
  
  public String generate(){
    int numChars = 36;
    return new BigInteger((int)(this.length * (Generator.log(numChars, 2))), this.rn).toString(numChars);
  }
  
  static double log(int x, int base)
  {
    return (Math.log(x) / Math.log(base));
  }
}
