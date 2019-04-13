package cz.lukas.spring.atm.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("csob")
public class CsobCommunicationService implements CommunicationService {
    @Override
    public String getPozdrav() {
        return "ČSOB zdraví";
    }
}
