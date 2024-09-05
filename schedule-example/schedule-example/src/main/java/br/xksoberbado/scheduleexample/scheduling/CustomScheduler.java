package br.xksoberbado.scheduleexample.scheduling;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Singleton
public class CustomScheduler {

    @Scheduled(cron = "*/15 * * * * *")
    public void run() {
        log.info("Thread: {}", Thread.currentThread().threadId());
    }
}
