package com.userregister.readerapi.database;

import com.userregister.readerapi.domain.GetUserPort;
import com.userregister.readerapi.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetUserAdapter implements GetUserPort {

    private final UserRepository userRepository;

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }
}
