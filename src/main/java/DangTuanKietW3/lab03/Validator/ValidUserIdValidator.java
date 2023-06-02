package DangTuanKietW3.lab03.Validator;

import DangTuanKietW3.lab03.Validator.annotation.ValidUserId;
import DangTuanKietW3.lab03.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
