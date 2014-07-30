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
    return new BigInteger(this.length*5, this.rn).toString(32);
  }
}
