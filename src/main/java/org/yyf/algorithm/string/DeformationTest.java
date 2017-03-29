package org.yyf.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tobi on 2017/1/20.
 */
public class DeformationTest {
    public static void main(String[] args) {
        String srcA = "abbcdefgh";
        String srcB = "hbgfedabc";
        System.out.println(isDeformation(srcA,srcB));

        String srcA1 = "abcdefgh";
        String srcB2 = "bacdefghh";
        System.out.println(isDeformation(srcA1,srcB2));

    }

    public static Boolean isDeformation(String srcA, String srcB) {
        //如果为null，直接返回false
        if(srcA==null||srcB==null){
            return false;
        }
        //根据题目的意思，如果2个字符的长度都不相等，肯定不可能是变形词
        if(srcA.length()!=srcB.length()){
            return false;
        }

        //将srcA的每个字符拆到map中，value为出现的次数
        char[] charsA = srcA.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : charsA) {
            Integer value = map.getOrDefault(aChar, 0);
            map.put(aChar, value + 1);
        }
        //将srcB也拆成字符数组，然后去map中按key查询，查到的
        //值为null或者=0，说明该字符在srcA中没有或者次数更少，
        //则为false，如果value值大于0，则减一继续匹配。
        char[] charsB = srcB.toCharArray();
        for (char c : charsB) {
            Integer counts = map.get(c);
            if(counts==null||counts<=0){
                return false;
            }else if(counts>0){
                map.put(c, --counts);
            }
        }
        return true;
    }


}
