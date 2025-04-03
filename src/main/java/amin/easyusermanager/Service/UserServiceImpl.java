package amin.easyusermanager.Service;

import amin.easyusermanager.Dto.CreateRequestDto;
import amin.easyusermanager.Dto.CreateResponseDto;
import amin.easyusermanager.Entity.User;
import amin.easyusermanager.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public CreateResponseDto save(CreateRequestDto requestDto) {

        User user = new User();
        user.setFirstName(requestDto.getFirstName());
        user.setLastName(requestDto.getLastName());
        user.setEmail(requestDto.getEmail());
        mapToCreateResponseDto(user);
        userRepo.save(user);
        return mapToCreateResponseDto(user);

    }

    @Override
    public CreateResponseDto get(Long id) {

        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
        return mapToCreateResponseDto(user);

    }

    @Override
    public CreateResponseDto update(Long id, CreateRequestDto createRequestDto) {

        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
        user.setFirstName(createRequestDto.getFirstName());
        user.setLastName(createRequestDto.getLastName());
        user.setEmail(createRequestDto.getEmail());
        mapToCreateResponseDto(user);
        userRepo.save(user);
        return mapToCreateResponseDto(user);

    }

    @Override
    public void delete(Long id) {

        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User Not Found"));
        userRepo.deleteById(id);

    }

    private CreateResponseDto mapToCreateResponseDto(User user) {

        CreateResponseDto createResponseDto = new CreateResponseDto();
        createResponseDto.setId(user.getId());
        createResponseDto.setFirstName(user.getFirstName());
        createResponseDto.setLastName(user.getLastName());
        createResponseDto.setEmail(user.getEmail());
        return createResponseDto;

    }
}