package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import defpackage.p21;
import defpackage.ru8;
import defpackage.tn2;
import defpackage.u21;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCallback<T> implements u21<T> {
    private final Twig twig = LumberMill.getLogger();

    public static String getDetails(ErrorObject errorObject) {
        String errorBody = errorObject.hasErrorBody() ? errorObject.getErrorBody() : errorObject.getThrowable().getMessage();
        return errorBody == null ? "unknown error" : errorBody;
    }

    private void handleError(ErrorObject errorObject) {
        logFailure("Api call failed", errorObject);
        onError(errorObject);
    }

    public void logFailure(String str, ErrorObject errorObject) {
        Twig twig = this.twig;
        StringBuilder sbB = tn2.b(str, ": ");
        sbB.append(getDetails(errorObject));
        twig.e(sbB.toString(), new Object[0]);
    }

    @Override // defpackage.u21
    public final void onFailure(p21<T> p21Var, Throwable th) {
        handleError(new ErrorObject(th, null));
    }

    @Override // defpackage.u21
    public final void onResponse(p21<T> p21Var, ru8<T> ru8Var) {
        if (ru8Var == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), null));
            return;
        }
        T t = ru8Var.b;
        if (t == null) {
            handleError(new ErrorObject(new IllegalStateException("No body returned from the server"), ru8Var));
        } else if (ru8Var.a.J) {
            onSuccess(t);
        } else {
            handleError(new ErrorObject(new Exception("Status code outside the 200-300 range"), ru8Var));
        }
    }

    public abstract void onSuccess(T t);

    public void onError(ErrorObject errorObject) {
    }
}
