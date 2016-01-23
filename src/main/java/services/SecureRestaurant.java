package services;

import model.User;

/**
 * Created by Yaroslav on 24.01.2016.
 */
public interface SecureRestaurant {
    boolean login(User user);
    void logout(User user);
}
