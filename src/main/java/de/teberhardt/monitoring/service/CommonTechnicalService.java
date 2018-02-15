package de.teberhardt.monitoring.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CommonTechnicalService {

    /**
     * dummy method to simulate some technical algorithm
     *
     * @return
     */
    public boolean isSomeCaseGranted() throws Exception {
        Random r = new Random();

        switch (r.nextInt(3)) {
            case 1:
                return true;

            case 2:
                return false;

            case 3:
                throw new Exception();
        }
        return false;
    }
}
