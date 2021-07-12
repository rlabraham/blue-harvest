package com.blueharvest.controller;

import com.blueharvest.model.User;
import com.blueharvest.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserControllerTests {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserController userController;

    @Test
    @DisplayName("getAll() returns all users")
    void getAllReturnsAllUsers() {
        final List<User> allUsersFromRepository = listOfUsers();

        when(userRepository.findAll()).thenReturn(allUsersFromRepository);

        assert(userController.getAll().equals(allUsersFromRepository));
    }

    private List<User> listOfUsers() {
        final User user1 = new User();
        user1.setUserID(1L);

        final User user2 = new User();
        user2.setUserID(2L);

        final List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        return users;
    }
}
