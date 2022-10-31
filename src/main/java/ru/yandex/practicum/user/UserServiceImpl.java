package ru.yandex.practicum.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.exception.NotFoundRecordInBD;
import ru.yandex.practicum.exception.ValidateException;
import ru.yandex.practicum.user.model.User;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;
    
    public UserServiceImpl(@Qualifier("InMemory") UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    /**
     * Получить пользователя по ID.
     *
     * @param id ID пользователя.
     * @return User - пользователь присутствует в библиотеке.
     * <p>null - пользователя нет в библиотеке.</p>
     */
    @Override
    public User getUserById(Long id) {
        User result = userRepository.getUserById(id);
        if (result == null) {
            String error = "В БД отсутствует запись о пользователе при получении пользователя по ID = " + id + ".";
            log.error(error);
            throw new NotFoundRecordInBD(error);
        }
        return result;
    }
    
    /**
     * Получение списка всех пользователей.
     *
     * @return Список пользователей.
     */
    @Override
    public List<User> getAllUsers() {
        return null;
    }
    
    /**
     * Добавить юзера в БД.
     *
     * @param user пользователь.
     * @return добавляемый пользователь.
     */
    @Override
    public User addToStorage(User user) throws ValidateException, NotFoundRecordInBD {
        return null;
    }
    
    /**
     * Обновить юзера в БД.
     *
     * @param user пользователь
     * @return обновлённый пользователь.
     */
    @Override
    public User updateInStorage(User user) {
        return null;
    }
    
    /**
     * Удалить пользователя из БД.
     *
     * @param id ID удаляемого пользователя
     * @throws NotFoundRecordInBD из метода validationService.checkExistUserInDB(id).
     */
    @Override
    public void removeFromStorage(Long id) {
    
    }
    
    /**
     * Добавить пользователей с ID1 и ID2 в друзья.
     *
     * @param id1 пользователь №1;
     * @param id2 пользователь №2.
     */
    @Override
    public void addEachOtherAsFriends(Long id1, Long id2) {
    
    }
    
    /**
     * Удалить пользователей из друзей.
     *
     * @param id1 пользователь №1.
     * @param id2 пользователь №2.
     */
    @Override
    public void deleteFromFriends(Long id1, Long id2) {
    
    }
    
    /**
     * Вывести список общих друзей.
     *
     * @param id1 пользователь №1
     * @param id2 пользователь №2
     * @return список общих друзей.
     */
    @Override
    public List<User> getCommonFriends(Long id1, Long id2) {
        return null;
    }
    
    /**
     * Вывести список друзей пользователя с ID.
     *
     * @param id ID пользователя.
     * @return список друзей.
     */
    @Override
    public List<User> getUserFriends(Long id) {
        return null;
    }
    
    /**
     * Метод проверки наличия пользователя в базе данных по ID.
     *
     * @param id пользователь, наличие логина которого необходимо проверить в базе данных.
     * @return ID, найденный в БД по логину.
     * Если возвращается не null, то после этой проверки можно обновлять пользователя,
     * присвоив ему ID из базы данных.
     * <p>null - пользователя нет в базе данных.</p>
     */
    @Override
    public Integer idFromDBByID(Long id) {
        return null;
    }
}
