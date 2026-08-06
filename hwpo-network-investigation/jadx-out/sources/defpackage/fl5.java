package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fl5 extends CancellationException {
    public final transient ll5 t;

    public fl5(String str, Throwable th, ll5 ll5Var) {
        super(str);
        this.t = ll5Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fl5)) {
            return false;
        }
        fl5 fl5Var = (fl5) obj;
        if (!xj5.a(fl5Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = fl5Var.t;
        if (obj2 == null) {
            obj2 = xb7.u;
        }
        Object obj3 = this.t;
        if (obj3 == null) {
            obj3 = xb7.u;
        }
        return xj5.a(obj2, obj3) && xj5.a(fl5Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.t;
        if (obj == null) {
            obj = xb7.u;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.t;
        if (obj == null) {
            obj = xb7.u;
        }
        sb.append(obj);
        return sb.toString();
    }
}
