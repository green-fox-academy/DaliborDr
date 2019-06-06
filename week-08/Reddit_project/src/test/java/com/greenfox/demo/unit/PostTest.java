package com.greenfox.demo.unit;

import com.greenfox.demo.models.Post;
import org.junit.Assert;
import org.junit.Test;


public class PostTest {

    @Test
    public void increment_isIncremented() {
        Post post = new Post();

        post.increment();

        Assert.assertEquals(1,post.getEvaluation());
    }
}
