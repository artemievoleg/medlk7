package medlk.utils;

import com.lambdaworks.crypto.SCryptUtil;

public abstract class HashManager {

    public static String getHash(String s){
        return SCryptUtil.scrypt(s, 16, 16, 16);
    }

    public static boolean checkHash(String s, String hash){
        return SCryptUtil.check(s, hash);
    }
}
