package com.userregister.readerapi.database;

import com.userregister.readerapi.database.jooq.Tables;
import com.userregister.readerapi.domain.User;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserRepository {

    private final DSLContext dslContext;

    public List<User> findAll() {
        return dslContext.selectFrom(Tables.USERS)
                .fetchInto(User.class);
    }
}
