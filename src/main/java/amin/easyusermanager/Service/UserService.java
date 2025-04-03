package amin.easyusermanager.Service;

import amin.easyusermanager.Dto.CreateRequestDto;
import amin.easyusermanager.Dto.CreateResponseDto;

public interface UserService {

    CreateResponseDto save(CreateRequestDto createRequestDto);

    CreateResponseDto get(Long id);

    CreateResponseDto update(Long id, CreateRequestDto createRequestDto);

    void delete(Long id);

}
