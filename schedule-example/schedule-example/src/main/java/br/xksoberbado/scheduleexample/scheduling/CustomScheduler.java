package br.xksoberbado.scheduleexample.scheduling;

import io.micronaut.scheduling.annotation.Scheduled;
import io.micronaut.scheduling.annotation.Schedules;
import jakarta.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Singleton
public class CustomScheduler {

    @Scheduled(cron = "*/10 * * * * *")
    public void cron() {
        log.info("Cron: {}", Thread.currentThread().threadId());
    }

    @Scheduled(fixedDelay = "10s")
    public void fixedDelay() {
        log.info("Fixed Delay: {}", Thread.currentThread().threadId());
    }

    @Schedules(
        value = {
            @Scheduled(fixedDelay = "2s"),
            @Scheduled(fixedDelay = "10s")
        }
    )
    public void schedules() {
        log.info("Schedules: {}", Thread.currentThread().threadId());
    }
}
