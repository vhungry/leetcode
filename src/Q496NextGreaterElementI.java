import java.util.HashMap;
import java.util.Map;

public class Q496NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r=new int[nums1.length];
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            int index=map.get(nums1[i]);
            int c=-1;
            for(int j=index+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]) {
                    c=nums2[j];
                    break;
                }
            }
            r[i]=c;
        }
        return r;
    }
}
