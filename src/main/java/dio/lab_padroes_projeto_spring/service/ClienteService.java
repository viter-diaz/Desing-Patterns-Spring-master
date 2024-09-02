package dio.lab_padroes_projeto_spring.service;

import dio.lab_padroes_projeto_spring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void inserir (Cliente cliente);
    void atualizar (Cliente cliente, Long id);
    void deletar (Long id);
}
