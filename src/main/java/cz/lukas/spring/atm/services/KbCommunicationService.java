package cz.lukas.spring.atm.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"kb"})
public class KbCommunicationService implements CommunicationService {
    @Override
    public String getPozdrav() {
        return "KB zdraví";
    }
}
