package com.gideon.knowmate.Service;


import com.gideon.knowmate.Entity.User;
import com.gideon.knowmate.Requests.LoginUserRequest;
import com.gideon.knowmate.Requests.RegisterUserRequest;
import com.gideon.knowmate.Response.AuthenticationResponse;
import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthService {
    void register(RegisterUserRequest request) throws MessagingException;
    AuthenticationResponse verifyUserEmailAndRegister(String email, String code);
    AuthenticationResponse authenticate(LoginUserRequest request);
    AuthenticationResponse refreshToken(String refreshToken);
    void resetPassword(String email) throws MessagingException;
    boolean verifyResetPasswordOTP(String email, String code);
    void setNewPassword(String email, String newPassword);
}
