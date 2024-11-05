package com.clerk.backend_api.helpers.jwks;

import java.util.Optional;
import com.clerk.backend_api.utils.Utils;

/**
* RequestState - Authentication State of the request.
*/
public final class RequestState {

    private final AuthStatus status;
    private final Optional<AuthErrorReason> authErrorReason;
    private final Optional<TokenVerificationErrorReason> tokenVerificationErrorReason;
    private final Optional<String> token;

    public RequestState(AuthStatus status,
                        Optional<AuthErrorReason> authErrorReason,
                        Optional<TokenVerificationErrorReason> tokenVerificationErrorReason,
                        Optional<String> token) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(authErrorReason, "authErrorReason");
        Utils.checkNotNull(tokenVerificationErrorReason, "tokenVerificationErrorReason");
        Utils.checkNotNull(token, "token");

        if (authErrorReason.isPresent() && tokenVerificationErrorReason.isPresent()) {
            throw new IllegalArgumentException("Only one of authErrorReason or tokenVerificationErrorReason should be provided.");
        }

        this.status = status;
        this.authErrorReason = authErrorReason;
        this.tokenVerificationErrorReason = tokenVerificationErrorReason;
        this.token = token;
    }

    public static RequestState signedIn(String token) {
        return new RequestState(AuthStatus.SIGNED_IN, Optional.empty(), Optional.empty(), Optional.of(token));
    }

    public static RequestState signedOut(AuthErrorReason reason) {
        return new RequestState(AuthStatus.SIGNED_OUT,
                                Optional.of(reason),
                                Optional.empty(),
                                Optional.empty());
    }

    public static RequestState signedOut(TokenVerificationErrorReason reason) {
        return new RequestState(AuthStatus.SIGNED_OUT,
                                Optional.empty(),
                                Optional.of(reason),
                                Optional.empty());
    }

    public AuthStatus status() {
        return status;
    }

    public boolean isSignedIn() {
        return status == AuthStatus.SIGNED_IN;
    }

    public boolean isSignedOut() {
        return status == AuthStatus.SIGNED_OUT;
    }

    public Optional<ErrorReason> reason() {
        if (authErrorReason.isPresent()) {
            return Optional.of(authErrorReason.get());
        }

        if (tokenVerificationErrorReason.isPresent()) {
            return Optional.of(tokenVerificationErrorReason.get());
        }

        return Optional.empty();
    }

    public Optional<String> token() {
        return token;
    }
}