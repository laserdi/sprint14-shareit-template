package ru.yandex.practicum.user.dto;

import lombok.Data;
import ru.yandex.practicum.validation.CreateObject;
import ru.yandex.practicum.validation.UpdateObject;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {
    Long id;        //ID пользователя.
    @NotBlank(groups = {CreateObject.class}, message = "Имя не может быть пустым.")
    String name;    //Имя пользователя.
    @NotBlank(groups = {CreateObject.class}, message = "Адрес электронной почты UserDTO не может быть пустым.")
    @Email(groups = {CreateObject.class, UpdateObject.class}, message = "Почта должна быть почтой.")
    String email;   //Электронная почта.
}