package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import defpackage.ru8;
import defpackage.su8;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ErrorObject {
    private final String errorBody;
    private final int statusCode;
    private final Throwable throwable;
    private final Twig twig = LumberMill.getLogger();

    public ErrorObject(Throwable th, ru8 ru8Var) {
        this.throwable = th;
        this.errorBody = parseErrorBody(ru8Var);
        this.statusCode = parseStatusCode(ru8Var);
    }

    private String parseErrorBody(ru8 ru8Var) {
        su8 su8Var;
        if (ru8Var == null || (su8Var = ru8Var.c) == null) {
            return null;
        }
        try {
            return su8Var.t();
        } catch (IOException e) {
            this.twig.internal("Couldn't parse error body: " + e.getMessage());
            return null;
        }
    }

    private int parseStatusCode(ru8 ru8Var) {
        if (ru8Var != null) {
            return ru8Var.a.w;
        }
        return -1;
    }

    public String getErrorBody() {
        return this.errorBody;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean hasErrorBody() {
        return this.errorBody != null;
    }
}
