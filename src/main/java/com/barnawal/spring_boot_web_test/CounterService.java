package com.barnawal.spring_boot_web_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class CounterService {
    private int count = 0;

    public CounterService(@Value("${counter.initial-value:0}") int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public void reset() {
        count = 0;
    }

    public int getCount() {
        return count;
    }
}
