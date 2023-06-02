package DangTuanKietW3.lab03.services;

import DangTuanKietW3.lab03.entity.User;
import DangTuanKietW3.lab03.repository.IRoleRepository;
import DangTuanKietW3.lab03.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUserName(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if(roleId !=0 && userId != 0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
