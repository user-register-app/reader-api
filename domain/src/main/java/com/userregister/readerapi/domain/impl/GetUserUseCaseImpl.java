package com.userregister.readerapi.domain.impl;

import com.userregister.readerapi.domain.GetUserPort;
import com.userregister.readerapi.domain.GetUserUseCase;
import com.userregister.readerapi.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetUserUseCaseImpl implements GetUserUseCase {

    private final GetUserPort getUserPort;

    @Override
    public List<User> all() {
        return getUserPort.all();
    }
}
