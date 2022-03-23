package com.lilianlima.app.userservice;

import com.lilianlima.app.ui.model.request.UserDetailsRequestModel;
import com.lilianlima.app.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);

}
