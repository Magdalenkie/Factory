package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testMakeShoppingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING,
                "My shopping list",
                "potatoes",
                "2.5");
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
        //then
        Assert.assertEquals("My shopping list", shopping.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING,
                "My painting task", "blue", "my car");
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //then
        Assert.assertEquals("My painting task", painting.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING,
                "My driving task", "to the mall", "my painted blue car");
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //then
        Assert.assertEquals("My driving task", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testNullTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task nullTask = taskFactory.makeTask("Null",
                "My null task", "", "");
        //then
        Assert.assertNull(nullTask);
    }
}

