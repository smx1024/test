package com.sx.suanfatest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SuanfatestApplicationTests {
    int nums[] = {4,3,2,7,8,2,3,1};

    @Test
    void contextLoads() {
            int n=nums.length;
            List<Integer> list =new ArrayList();
            int b=0;
            for(int i=0;i<n;i++){
                while(i!=nums[i]-1){
                    int k=nums[nums[i]-1];
                    nums[nums[i]-1]=nums[i];
                    nums[i]=k;
                }
        }
            for(int i=0;i<n;i++){
                if(nums[i]!=i+1){
                    list.add(nums[i]);
                }
            }
            list.stream().forEach(System.out::println);
    }

}
