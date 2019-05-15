
package com.bibliotheque.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;


public class BatchTasklet implements Tasklet{
    
    @Value("BATCH A ETE LANCE AUTOMATIQUEMENT !") private String message;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);
    return RepeatStatus.FINISHED;
    }
    
}
