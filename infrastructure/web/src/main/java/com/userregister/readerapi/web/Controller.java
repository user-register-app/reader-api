package com.userregister.readerapi.web;

import com.userregister.readerapi.domain.GetUserUseCase;
import com.userregister.readerapi.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final GetUserUseCase getUserUseCase;

    @GetMapping("/users")
    public List<User> getAll() {
        return getUserUseCase.all();
    }
}