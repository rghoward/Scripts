package io.ably.lib.types;

import io.ably.lib.network.FailedConnectionException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AblyException extends Exception {
    private static final long serialVersionUID = -3804072091596832634L;
    public ErrorInfo errorInfo;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class HostFailedException extends AblyException {
        private static final long serialVersionUID = 1;

        public HostFailedException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }

    public AblyException(Throwable th, ErrorInfo errorInfo) {
        super(th);
        this.errorInfo = errorInfo;
    }

    public static AblyException fromErrorInfo(Throwable th, ErrorInfo errorInfo) {
        int i = errorInfo.statusCode;
        return (i < 500 || i > 504) ? new AblyException(th, errorInfo) : new HostFailedException(th, errorInfo);
    }

    public static AblyException fromThrowable(Throwable th) {
        if (th instanceof AblyException) {
            return (AblyException) th;
        }
        if ((th instanceof ConnectException) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof NoRouteToHostException)) {
            return new HostFailedException(th, ErrorInfo.fromThrowable(th));
        }
        return th instanceof FailedConnectionException ? new HostFailedException(th.getCause(), ErrorInfo.fromThrowable(th.getCause())) : new AblyException(th, ErrorInfo.fromThrowable(th));
    }

    public static AblyException fromErrorInfo(ErrorInfo errorInfo) {
        return fromErrorInfo(new Exception(errorInfo.message), errorInfo);
    }
}
