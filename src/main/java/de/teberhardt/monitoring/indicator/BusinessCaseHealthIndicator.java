package de.teberhardt.monitoring.indicator;

import de.teberhardt.monitoring.service.CommonTechnicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;


/**
 * This Class should represent a standard HealthIndicator for some simple business case
 */
@Service
public class BusinessCaseHealthIndicator implements HealthIndicator {


    private final CommonTechnicalService ctService;

    @Autowired
    public BusinessCaseHealthIndicator(CommonTechnicalService ctService) {
    this.ctService = ctService;
    }

    @Override
    public Health health() {
        Health h;
        try {
            if (ctService.isSomeCaseGranted()) {
                h = Health.up().build();
            }
            else
            {
                h = Health.down().build();
            }
        }
        catch (Exception e)
        {
            h = Health.unknown().withException(e).build();
        }

        return h;
    }
}
