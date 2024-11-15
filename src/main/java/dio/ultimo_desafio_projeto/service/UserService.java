package dio.ultimo_desafio_projeto.service;

import dio.ultimo_desafio_projeto.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
