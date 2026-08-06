package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.e44;
import defpackage.qq2;
import defpackage.xj5;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ClientError extends NetworkResponse {
        public static final int $stable = 8;
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientError(Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = clientError.error;
            }
            return clientError.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final ClientError copy(Throwable th) {
            th.getClass();
            return new ClientError(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientError) && xj5.a(this.error, ((ClientError) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ClientError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NetworkError extends NetworkResponse {
        public static final int $stable = 8;
        private final IOException error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(IOException iOException) {
            super(null);
            iOException.getClass();
            this.error = iOException;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i, Object obj) {
            if ((i & 1) != 0) {
                iOException = networkError.error;
            }
            return networkError.copy(iOException);
        }

        public final IOException component1() {
            return this.error;
        }

        public final NetworkError copy(IOException iOException) {
            iOException.getClass();
            return new NetworkError(iOException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && xj5.a(this.error, ((NetworkError) obj).error);
        }

        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "NetworkError(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ServerError extends NetworkResponse {
        public static final int $stable = 0;
        private final int code;

        public ServerError(int i) {
            super(null);
            this.code = i;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = serverError.code;
            }
            return serverError.copy(i);
        }

        public final int component1() {
            return this.code;
        }

        public final ServerError copy(int i) {
            return new ServerError(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && this.code == ((ServerError) obj).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        public String toString() {
            return e44.a(new StringBuilder("ServerError(code="), this.code, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Success<T> extends NetworkResponse<T> {
        public static final int $stable = 0;
        private final T body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(T t) {
            super(null);
            t.getClass();
            this.body = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.body;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.body;
        }

        public final Success<T> copy(T t) {
            t.getClass();
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && xj5.a(this.body, ((Success) obj).body);
        }

        public final T getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        public String toString() {
            return "Success(body=" + this.body + ')';
        }
    }

    public /* synthetic */ NetworkResponse(qq2 qq2Var) {
        this();
    }

    private NetworkResponse() {
    }
}
